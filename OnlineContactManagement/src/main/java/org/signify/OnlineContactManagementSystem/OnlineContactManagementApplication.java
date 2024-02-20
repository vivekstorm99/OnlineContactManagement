package org.signify.OnlineContactManagementSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class OnlineContactManagementApplication {
//	Logger log= LoggerFactory.getLogger(OnlineContactManagementApplication.class);
//
//	@GetMapping("/user/{id}")
//	public String greeting(@PathVariable String name){
//		log.debug("Request{}",name)
//		String response="hi"+name+"welcome here";
//		return response;
//	}

	public static void main(String[] args) {
		SpringApplication.run(OnlineContactManagementApplication.class, args);
	}

}
