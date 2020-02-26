package com.aircon;

public class airconTest{

	public static void main(String[] args) {
		
		//samsungaircon1 sa1 = new samsungaircon1("Samsung", "Side by side", "RS62R50011L", "White");
		//sa1.print();
		
		aircon aircons[] = new aircon[3];
			aircons[0] = new samsungaircon1 ("Samsung", "Split type- Wall mounted", "AR9500M", "White");
			aircons[1] = new samsungaircon1 ("Samsung", "Floor Standing", "AF9000", "Silver");
			aircons[2] = new LGaircon1 ("LG", "Window type", "LA250WC" , "White", 120);
				
		for (aircon aircon : aircons) {
			aircon.print();
			System.out.println("");
				}
	}
}
