package com.bitbrains;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Electronics {

	private List<String> productslist;
	
	@Autowired
	public void setproductsList(List<String> productslist) {
		this.productslist = productslist;
	}
	
	public void dispalyProducts() {
		System.out.println("List of Products:");
		for(String prod : productslist) {
			System.out.println("- "+ prod);
		}
	}
}
