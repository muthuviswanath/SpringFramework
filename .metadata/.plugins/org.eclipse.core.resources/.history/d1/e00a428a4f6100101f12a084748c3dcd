package com.bitbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestList {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Trainer tr = ctx.getBean(Trainer.class);
		tr.printCourses();
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
