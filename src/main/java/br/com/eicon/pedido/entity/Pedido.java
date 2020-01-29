package br.com.eicon.pedido.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="pedido")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_pedido", nullable = false)
	private Date dataPedido;

	@OneToOne
    @JoinColumn
	private Cliente cliente;

	@OneToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
	private Status status;
	
	@Column(name = "valor_total", nullable = false)
	private Double input;

	@OneToMany(mappedBy = "pedido")
	private Set<PedidoItem> itens;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Double getValorTotal() {
		input = new Double(0);
		for (PedidoItem item: itens) {
			input += item.getValor().doubleValue();
		}
		BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public void setValorTotal(Double valorTotal) {
		this.input = valorTotal;
	}

	public Set<PedidoItem> getItens() {
		return itens;
	}

	public void setItens(Set<PedidoItem> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", dataPedido=" + dataPedido + ", cliente=" + cliente + ", status=" + status
				+ ", valorTotal=" + input + ", itens=" + itens + "]";
	}
	
}