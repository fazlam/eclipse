package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		Cracker cracker=new Cracker("boxtype");
		cracker.setPrice(50.0);
		cracker.quantity=6.4;
		cracker.showValue();
		cracker.totalPrice();
		

	}

}
