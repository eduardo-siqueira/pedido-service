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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PedidoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PedidoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="data-pedido" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cliente" type="{http://www.eicon.com.br/EBO/Eicon/v1}ClienteType"/>
 *         &lt;element name="status" type="{http://www.eicon.com.br/EBO/Eicon/v1}StatusType"/>
 *         &lt;element name="itens" type="{http://www.eicon.com.br/EBO/Eicon/v1}ArrayOfPedidoItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoType", propOrder = {
    "id",
    "dataPedido",
    "cliente",
    "status",
    "itens"
})
public class PedidoType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(name = "data-pedido", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPedido;
    @XmlElement(required = true)
    protected ClienteType cliente;
    @XmlElement(required = true)
    protected StatusType status;
    @XmlElement(required = true)
    protected ArrayOfPedidoItemType itens;

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
     * Obtém o valor da propriedade dataPedido.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPedido() {
        return dataPedido;
    }

    /**
     * Define o valor da propriedade dataPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPedido(XMLGregorianCalendar value) {
        this.dataPedido = value;
    }

    /**
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link ClienteType }
     *     
     */
    public ClienteType getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteType }
     *     
     */
    public void setCliente(ClienteType value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedidoItemType }
     *     
     */
    public ArrayOfPedidoItemType getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedidoItemType }
     *     
     */
    public void setItens(ArrayOfPedidoItemType value) {
        this.itens = value;
    }

}
