package br.com.eicon.pedido.util;

import java.math.BigInteger;

import br.com.eicon.pedido.entity.Cliente;
import br.com.eicon.pedido.entity.Produto;
import br.com.eicon.pedido.entity.Status;
import br.com.eicon.pedido.service.schema.ClienteType;
import br.com.eicon.pedido.service.schema.ProdutoType;
import br.com.eicon.pedido.service.schema.StatusType;

public class ConvertUtil {

	public static ClienteType newClienteType(Cliente cliente) {
		ClienteType clienteType = new ClienteType();
		clienteType.setDataInclusao(DateUtil.newXMLGregorianCalendar(cliente.getDataInclusao()));
		clienteType.setDataNascimento(DateUtil.newXMLGregorianCalendar(cliente.getDataNascimento()));
		clienteType.setId(BigInteger.valueOf(cliente.getId()));
		clienteType.setNome(cliente.getNome());
		clienteType.setSobrenome(cliente.getSobrenome());
		return clienteType;
	}

	public static StatusType newStatusType(Status status) {
		StatusType statusType = new StatusType();
		statusType.setId(BigInteger.valueOf(status.getId()));
		statusType.setDescricao(status.getDescricao());
		return statusType;
	}

	public static ProdutoType newProdutoType(Produto produto) {
		ProdutoType produtoType = new ProdutoType();
		produtoType.setAtivo(true);
		produtoType.setDescricao(produto.getDescricao());
		produtoType.setId(BigInteger.valueOf(produto.getId()));
		return produtoType;
	}

}
