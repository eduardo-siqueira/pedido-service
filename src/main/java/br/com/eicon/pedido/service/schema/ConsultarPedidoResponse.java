//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.01.29 às 08:58:10 PM BRST 
//


package br.com.eicon.pedido.service.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="pedidos" type="{http://www.eicon.com.br/EBO/Eicon/v1}ArrayOfPedidoType"/>
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
    "pedidos"
})
@XmlRootElement(name = "ConsultarPedidoResponse")
public class ConsultarPedidoResponse {

    @XmlElement(required = true)
    protected ArrayOfPedidoType pedidos;

    /**
     * Obtém o valor da propriedade pedidos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedidoType }
     *     
     */
    public ArrayOfPedidoType getPedidos() {
        return pedidos;
    }

    /**
     * Define o valor da propriedade pedidos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedidoType }
     *     
     */
    public void setPedidos(ArrayOfPedidoType value) {
        this.pedidos = value;
    }

}
