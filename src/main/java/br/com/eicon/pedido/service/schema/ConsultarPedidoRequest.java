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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido-id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="data-pedido" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cliente-id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pedidoId",
    "dataPedido",
    "clienteId"
})
@XmlRootElement(name = "ConsultarPedidoRequest")
public class ConsultarPedidoRequest {

    @XmlElement(name = "pedido-id", required = true)
    protected BigInteger pedidoId;
    @XmlElement(name = "data-pedido", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPedido;
    @XmlElement(name = "cliente-id", required = true)
    protected BigInteger clienteId;

    /**
     * Obtém o valor da propriedade pedidoId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPedidoId() {
        return pedidoId;
    }

    /**
     * Define o valor da propriedade pedidoId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPedidoId(BigInteger value) {
        this.pedidoId = value;
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
     * Obtém o valor da propriedade clienteId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClienteId() {
        return clienteId;
    }

    /**
     * Define o valor da propriedade clienteId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClienteId(BigInteger value) {
        this.clienteId = value;
    }

}
