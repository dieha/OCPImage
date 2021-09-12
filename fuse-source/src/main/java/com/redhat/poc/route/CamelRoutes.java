package com.redhat.poc.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.redhat.poc.bean.BodyProcessor;
import com.redhat.poc.bean.RequestProcessor;
import com.redhat.poc.bean.SysoProcessor;

@Component
public class CamelRoutes extends RouteBuilder {

	SysoProcessor sysoPr = new SysoProcessor();
	BodyProcessor bodyPr = new BodyProcessor();
	RequestProcessor reqeustPr = new RequestProcessor();

	@Override
	public void configure() throws Exception {

		from("direct:formatHttpRequest")
			.removeHeaders("*")
			.process(bodyPr)
			.setHeader("Content-Type", simple("application/json")).setHeader("CamelHttpMethod", simple("POST"))
			.end();
		
		from("direct:transRequest")
			.process(reqeustPr)
			.end();
		
		from("direct:rollback")
			.to("direct:formatHttpRequest")
			.setHeader("CamelHttpUri", simple("${sysenv.POC_SERVICE_URL_REMITTANCE}/remittance/compensateInward"))	
			.to("jetty:https://rollback/")	
			.log("rollback ${body}")
			.end();

	}
}