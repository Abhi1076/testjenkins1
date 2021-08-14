package com.abhi.testjenking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestjenkingApplication {
 public static Logger loger = LoggerFactory.getLogger(TestjenkingApplication.class);
 
	public static void main(String[] args) {
		loger.info("inside my code11");		
		SpringApplication.run(TestjenkingApplication.class, args);
	}

}
