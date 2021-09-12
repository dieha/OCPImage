package com.redhat.poc.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SysoProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("IN:");
		System.out.println(exchange.getIn());
		System.out.println("Header:");
		System.out.println(exchange.getIn().getHeaders());
		System.out.println("Body:");
		System.out.println(exchange.getIn().getBody());
	}

}
