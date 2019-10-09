package com.java;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.outer")
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
	  
	    ApplicationContext applicationContext = SpringApplication.run(Example.class, args);
	    for(String name: applicationContext.getBeanDefinitionNames()){
		    System.out.println(name);
	    }
	}

}
