package com.aircon;

public class LGaircon1 extends aircon{

	private String model;
	private String color;
	private int voltage;
	
	public LGaircon1(String brand, String type, String model, String color, int voltage) {
		super(brand, type);
		this.model = model;
		this.color = color;
		this.voltage = voltage; 
}
	
	public void print() {
		System.out.println("Aircon details: ");
		super.print();
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Voltage: " + voltage);
	}

}
