package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringEndClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEndClientApplication.class, args);
	}
}

@RefreshScope
@org.springframework.web.bind.annotation.RestController
class RestController{
	
	@Value("${msg:Hello world - Config Server is not working..pelase check}")
	private String msg;
	
	@RequestMapping("/msg")
	public String showMessage(){
		return msg+" Ankit";
	}
	
}
