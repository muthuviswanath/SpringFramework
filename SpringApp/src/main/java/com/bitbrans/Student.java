package com.bitbrans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("101")
	private int studentId;
	
	@Value("Rahul Gandhi")
	private String studentName;
	
	@Value("B.A in Political Science")
	private String course;
	
	@Value("34.5")
	private double percentage;
	
	public void display() {
		System.out.println("Student Id:" + studentId);
		System.out.println("Student Name:" + studentName);
		System.out.println("Course:" + course);
		System.out.println("Percentage:" + percentage + "%");
	}
	

}
