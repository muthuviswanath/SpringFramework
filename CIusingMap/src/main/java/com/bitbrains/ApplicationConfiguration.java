package com.bitbrains;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bitbrains")
public class ApplicationConfiguration {

	@Bean
	public Map<String, Trainer>  setCourseTranerMapping(){
		return Map.of(
				"Java", new Trainer("Mr.360"),
				"Python", new Trainer("Muthu"),
				"Adv Java", new Trainer("Rohan"),
				"Devops", new Trainer("Dikshit"),
				"FrontEnd", new Trainer("Sharath")
				);
	} 
}
