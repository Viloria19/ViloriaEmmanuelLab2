package com.aircon;

public class aircon {

	String brand;
	String type;
	
	public aircon(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void print() {
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
	}
}
