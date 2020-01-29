package br.com.eicon.pedido;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {
	
	private static final String TARGET_NAMESPACE_URI = "http://www.eicon.com.br/EBO/Eicon/v1";
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/service/*");
	}

	@Bean(name = "ConsultarPedido")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema pedidoSchema) {
		DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
		defaultWsdl11Definition.setPortTypeName("PedidoPort");
		defaultWsdl11Definition.setLocationUri("/service/ConsultarPedido");
		defaultWsdl11Definition.setTargetNamespace(TARGET_NAMESPACE_URI);
		defaultWsdl11Definition.setSchema(pedidoSchema);
		return defaultWsdl11Definition;
	}
	
	@Bean
	public XsdSchema pedidoSchema() {
		return new SimpleXsdSchema(new ClassPathResource("ConsultarPedidov1.xsd"));
	}
}
