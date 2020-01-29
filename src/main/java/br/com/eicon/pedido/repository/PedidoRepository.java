package br.com.eicon.pedido.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eicon.pedido.entity.Cliente;
import br.com.eicon.pedido.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer>{

	List<Pedido> findByCliente(Cliente cliente);
	
	List<Pedido> findByDataPedido(Date dataPedido);
}
