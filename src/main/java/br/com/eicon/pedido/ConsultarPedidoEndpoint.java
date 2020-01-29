package br.com.eicon.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.eicon.pedido.repository.PedidoRepository;
import br.com.eicon.pedido.service.schema.ConsultarPedidoRequest;
import br.com.eicon.pedido.service.schema.ConsultarPedidoResponse;

@Endpoint
public class ConsultarPedidoEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.eicon.com.br/EBO/Eicon/v1";
	 
	@Autowired
	private PedidoRepository pedidoRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultarPedidoRequest")
	@ResponsePayload
	public ConsultarPedidoResponse getOrder(@RequestPayload ConsultarPedidoRequest request) {
		ConsultarPedidoResponse response = new ConsultarPedidoResponse();
//		response.setPedido(pedidoRepository.findById(request.getPedidoId()));
		return response;
	}
	
}
