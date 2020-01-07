package com.java;
import com.java.source.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.outer")
@ComponentScan
public class Example {
	@Autowired
	private  PropertyByValueSource pbvs;


	@RequestMapping("/")
	String home() {
		return "Sample CICD with cloud-build and kubernetes";
	}
	@RequestMapping("/gender")
	public String getGender() {
		return pbvs.getEmployeeGender();
	}

	public static void main(String[] args) {
	  
	    SpringApplication.run(Example.class, args);
	}

}
