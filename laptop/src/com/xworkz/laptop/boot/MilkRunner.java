package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		Milk milk=new Milk(60.0,"vissel");
		milk.weight=5;
		milk.display();

	}

}
