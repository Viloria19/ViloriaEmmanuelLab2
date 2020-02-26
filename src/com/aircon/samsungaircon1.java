package com.aircon;

	public class samsungaircon1 extends aircon{
		private String model;
		private String color;
		
	public samsungaircon1(String brand, String type, String model, String color) {
		super(brand, type);
		this.model = model;
		this.color = color;
}
	public void print() {
		System.out.println("Aircon details: ");
		super.print();
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
	}
	
}
