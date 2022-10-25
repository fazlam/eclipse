package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		Mango mango=new Mango("Kesar", 50);
		mango.details();
		mango.weight=24.5;

	}

}
