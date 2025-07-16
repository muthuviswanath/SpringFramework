package com.bitbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	CourseList cl = ctx.getBean(CourseList.class);
	cl.displayCourseCatalog();
}
}
