package com.redhat.poc.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class BodyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody(exchange.getProperty("request"));
	}

}
