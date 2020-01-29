//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.01.29 às 12:31:33 AM BRST 
//


package br.com.eicon.pedido.service.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.eicon.pedido.service.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.eicon.pedido.service.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPedidoResponse }
     * 
     */
    public ConsultarPedidoResponse createConsultarPedidoResponse() {
        return new ConsultarPedidoResponse();
    }

    /**
     * Create an instance of {@link PedidoType }
     * 
     */
    public PedidoType createPedidoType() {
        return new PedidoType();
    }

    /**
     * Create an instance of {@link ConsultarPedidoRequest }
     * 
     */
    public ConsultarPedidoRequest createConsultarPedidoRequest() {
        return new ConsultarPedidoRequest();
    }

    /**
     * Create an instance of {@link ClienteType }
     * 
     */
    public ClienteType createClienteType() {
        return new ClienteType();
    }

    /**
     * Create an instance of {@link ArrayOfPedidoItemType }
     * 
     */
    public ArrayOfPedidoItemType createArrayOfPedidoItemType() {
        return new ArrayOfPedidoItemType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link PedidoItemType }
     * 
     */
    public PedidoItemType createPedidoItemType() {
        return new PedidoItemType();
    }

    /**
     * Create an instance of {@link ProdutoType }
     * 
     */
    public ProdutoType createProdutoType() {
        return new ProdutoType();
    }

}
