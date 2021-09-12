package com.redhat.poc.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
	    String input = exchange.getIn().getBody(String.class);
		exchange.setProperty("request", input);
	}

}
