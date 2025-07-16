package com.bitbrans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext
				(AppConfig.class);
		Participants stu = context.getBean(Participants.class);
		stu.display();
		
	}
}
