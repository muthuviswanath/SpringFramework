package com.bitbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private Processor pro;
	
	public Laptop() {
		System.out.println("Laptop Object Created without "
				+ "dependency injection thru constructor");
	}

	@Autowired
	public void setPro(Processor pro) {
		this.pro = pro;
	}
	
	public void displayObject() {
		System.out.println("Laptop configured with the processor: " + 
	pro.getProcessorInfo());
	} 
	
}
