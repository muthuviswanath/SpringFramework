package com.bitbrains;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Trainer {

	private final List<String> courses;

	public Trainer(List<String> courses) {
		this.courses = courses;

	}
	
	public void printCourses() {
		System.out.println("Courses handled by the Trainer:");
		courses.forEach(System.out::println);
	}
}
