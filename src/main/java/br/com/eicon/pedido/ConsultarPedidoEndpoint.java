package br.com.eicon.pedido;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.eicon.pedido.entity.Cliente;
import br.com.eicon.pedido.entity.Pedido;
import br.com.eicon.pedido.entity.PedidoItem;
import br.com.eicon.pedido.repository.PedidoRepository;
import br.com.eicon.pedido.service.schema.ArrayOfPedidoItemType;
import br.com.eicon.pedido.service.schema.ArrayOfPedidoType;
import br.com.eicon.pedido.service.schema.ConsultarPedidoRequest;
import br.com.eicon.pedido.service.schema.ConsultarPedidoResponse;
import br.com.eicon.pedido.service.schema.PedidoItemType;
import br.com.eicon.pedido.service.schema.PedidoType;
import br.com.eicon.pedido.util.ConvertUtil;
import br.com.eicon.pedido.util.DateUtil;

@Endpoint
public class ConsultarPedidoEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.eicon.com.br/EBO/Eicon/v1";
	 
	@Autowired
	private PedidoRepository pedidoRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultarPedidoRequest")
	@ResponsePayload
	public ConsultarPedidoResponse newConsultarPedidoResponse(@RequestPayload ConsultarPedidoRequest request) {
		ConsultarPedidoResponse response = new ConsultarPedidoResponse();
		response.setPedidos(new ArrayOfPedidoType());
		
		List<Pedido> pedidoList = new ArrayList<>();
		
		if (request.getPedidoId() != null && request.getPedidoId().intValue() > 0) {
			Optional<Pedido> optional = pedidoRepository.findById(request.getPedidoId().intValue());
			if (optional.isPresent()) {
				pedidoList.add(optional.get());
			}
		}
		else if (request.getDataPedido() != null) {
			pedidoList.addAll(pedidoRepository.findByDataPedido(request.getDataPedido().toGregorianCalendar().getTime()));
		}
		else if (request.getClienteId() != null && request.getClienteId().intValue() > 0) {
			pedidoList.addAll(pedidoRepository.findByCliente(new Cliente(request.getClienteId().intValue())));
		}
		else {
			pedidoRepository.findAll().forEach(pedidoList::add);
		}
		
		for (Pedido pedido: pedidoList) {
			PedidoType pedidoType = new PedidoType();
			pedidoType.setCliente(ConvertUtil.newClienteType(pedido.getCliente()));
			pedidoType.setDataPedido(DateUtil.newXMLGregorianCalendar(pedido.getDataPedido()));
			pedidoType.setId(BigInteger.valueOf(pedido.getId()));
			pedidoType.setStatus(ConvertUtil.newStatusType(pedido.getStatus()));
			
			for (PedidoItem pedidoItem: pedido.getItens()) {
				PedidoItemType pedidoItemType = new PedidoItemType();
				pedidoItemType.setId(BigInteger.valueOf(pedidoItem.getId()));
				pedidoItemType.setProduto(ConvertUtil.newProdutoType(pedidoItem.getProduto()));
				pedidoItemType.setQuantidade(BigInteger.valueOf(pedidoItem.getQuantidade()));
				pedidoItemType.setValor(pedidoItem.getValor());
				pedidoType.setItens(new ArrayOfPedidoItemType());
				pedidoType.getItens().getItem().add(pedidoItemType);
			}
			response.getPedidos().getPedido().add(pedidoType);
		}
		return response;
	}
	
}
