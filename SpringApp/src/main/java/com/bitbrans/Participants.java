package com.bitbrans;

import org.springframework.stereotype.Component;

@Component
public class Participants {

	private final Course course;
	
	public Participants(Course course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("You are learning: " + course.getCourseName());
	}
	
	
}
