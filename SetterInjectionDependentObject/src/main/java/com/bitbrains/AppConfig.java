package com.bitbrains;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bitbrains")
public class AppConfig {

	@Bean
	public List<String> products(){
		return List.of("Mouse","Keyboard","Projector","Printer");
	}
}
