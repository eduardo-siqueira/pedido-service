package br.com.eicon.pedido.controller;

import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eicon.pedido.entity.Cliente;
import br.com.eicon.pedido.entity.Pedido;
import br.com.eicon.pedido.repository.PedidoRepository;

@RestController
@RequestMapping(path = "/pedido/consulta")
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
	public Optional<Pedido> findById(@PathVariable("id") String id) {
		try {
			return repository.findById(Integer.parseInt(id));
		} catch (Exception e) {
			return null;
		}
	}	
	
	@GetMapping(path = "/data-pedido/{data}")
	public Iterable<Pedido> findByDataPedido(@PathVariable("data") String data) {
		try {
			return repository.findByDataPedido(new SimpleDateFormat("yyyy-MM-dd").parse(data));
		} catch (Exception e) {
			return null;
		}
	}	

	@GetMapping(path = "/cliente/{id}")
	public Iterable<Pedido> findByCliente(@PathVariable("id") String id) {
		try {
			return repository.findByCliente(new Cliente(Integer.parseInt(id)));
		} catch (Exception e) {
			return null;
		}
	}	
}
