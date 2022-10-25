package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		Flower flower=new Flower(50);
		flower.chooseWeight(1.1);
		flower.quantity=5;
		flower.display();
		flower.totalPrice();

	}

}
