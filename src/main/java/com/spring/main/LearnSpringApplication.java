package com.spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import components.FetchData;


//@SpringBootApplication

@ComponentScan(basePackages = "components")
@Configuration
public class LearnSpringApplication {
	

	public static void main(String[] args) {

		try (
		var context = new AnnotationConfigApplicationContext(LearnSpringApplication.class)) 
		{
	
			context.getBean(FetchData.class).fetchDetails();
			
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
		
		
	}

}


