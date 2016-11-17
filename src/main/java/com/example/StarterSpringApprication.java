package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StarterSpringApprication {
	
	public static void main(String[] args){
		ConfigurableApplicationContext cac = SpringApplication.run(StarterSpringApprication.class, args);
		StarterSpringApprication ssa = cac.getBean(StarterSpringApprication.class);
		ssa.hello();
	}
	
	public void hello(){
		System.out.println("Hello World!!!");
	}
}