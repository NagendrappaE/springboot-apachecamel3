package com.example.springbootapachexml;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class FileNamaProcessor  implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		
		System.err.println("xyxx"+exchange.getIn());
		
		exchange.getIn().setHeader(Exchange.FILE_NAME, "myfile"+UUID.randomUUID().toString()+".txt");
		
		exchange.getIn().setBody("Hello nagendra");
	}

}
