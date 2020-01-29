package br.com.eicon.pedido.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eicon.pedido.entity.Cliente;
import br.com.eicon.pedido.entity.Pedido;
import br.com.eicon.pedido.repository.PedidoRepository;

@RestController
@RequestMapping(path = "/pedido")
public class PedidoController {

	private PedidoRepository repository;

	public PedidoController(PedidoRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping(path = "/all")
	public Iterable<Pedido> findAll() {
		return repository.findAll();
	}	

	@GetMapping(path = "/id/{id}")
	public Optional<Pedido> findById(@PathVariable("id") Integer id) {
		return repository.findById(id);
	}	
	
	@GetMapping(path = "/data-pedido/{data-pedido}")
	public Iterable<Pedido> findByDataPedido(@PathVariable("data-pedido") String filter) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataPedido;
		try {
			dataPedido = sdf.parse(filter);
		} catch (ParseException e) {
			return null;
		}
		return repository.findByDataPedido(dataPedido);
	}	

	@GetMapping(path = "/cliente/{id}")
	public Iterable<Pedido> findByCliente(@PathVariable("id") Integer id) {
		return repository.findByCliente(new Cliente(id));
	}	
}
