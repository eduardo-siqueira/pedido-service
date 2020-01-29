//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.01.29 às 08:58:10 PM BRST 
//


package br.com.eicon.pedido.service.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PedidoItemType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PedidoItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="produto" type="{http://www.eicon.com.br/EBO/Eicon/v1}ProdutoType"/>
 *         &lt;element name="pedido" type="{http://www.eicon.com.br/EBO/Eicon/v1}PedidoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoItemType", propOrder = {
    "id",
    "quantidade",
    "valor",
    "produto",
    "pedido"
})
public class PedidoItemType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected BigInteger quantidade;
    protected double valor;
    @XmlElement(required = true)
    protected ProdutoType produto;
    @XmlElement(required = true)
    protected PedidoType pedido;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidade(BigInteger value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoType }
     *     
     */
    public ProdutoType getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoType }
     *     
     */
    public void setProduto(ProdutoType value) {
        this.produto = value;
    }

    /**
     * Obtém o valor da propriedade pedido.
     * 
     * @return
     *     possible object is
     *     {@link PedidoType }
     *     
     */
    public PedidoType getPedido() {
        return pedido;
    }

    /**
     * Define o valor da propriedade pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidoType }
     *     
     */
    public void setPedido(PedidoType value) {
        this.pedido = value;
    }

}
