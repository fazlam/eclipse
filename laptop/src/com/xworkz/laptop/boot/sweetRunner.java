package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.Sweet;

import constant.Sweets;

public class sweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet = new Sweet("KOVA");
		sweet.setPrice(50.0);
		sweet.quantity=4.4;
	
		sweet.showPrice();
		sweet.totalPrice();
		System.out.println("************");
		Sweet sweet2=new Sweet("kaju");
		Sweet.shopName="kantara";
			sweet2.color=Sweets.YELLOW;
			sweet2.setPrice(56.8);
			sweet2.quantity=10.0;
			sweet2.showPrice();
			sweet2.totalPrice();
		
		
		
	}

}
