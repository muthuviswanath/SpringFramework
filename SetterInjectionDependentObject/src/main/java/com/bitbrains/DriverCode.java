package com.bitbrains;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverCode {
	static ApplicationContext ctx;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		do {
			System.out.println("1. Dependent Object");
			System.out.println("2. SI through List");
			System.out.println("3. SI using Map List");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Laptop l = ctx.getBean(Laptop.class);
				l.displayObject();
				break;
			case 2:
				Electronics e = ctx.getBean(Electronics.class);
				e.dispalyProducts();
				break;
			case 3:
				break;
			case 4:
				return;
			default:
				System.out.println("Invalid Choice");
			}
				
		}while(true);
		
	}
}
