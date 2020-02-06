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
	@RequestMapping("/msg")
        public String getMsg() {
                return "Finaly skaffold is done!";
        }
	@RequestMapping("/greetings")
        public String getGreeting() {
                return "Good Morning!";
        }



	public static void main(String[] args) {
	  
	    SpringApplication.run(Example.class, args);
	}

}
