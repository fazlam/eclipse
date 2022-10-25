package com.xworkz.laptop.things;

import constant.colors;

public class Flower {
	public static String name="Rose";
	public colors color=colors.RED;
	public double price;
	public double weight;
	public int quantity;
	
	static {
		
	}
	public Flower(double price) {
		this.price=price;
	}
	public void chooseWeight(double weight) {
		this.weight=weight;
		
	}
	public void display() {
		System.out.println("flower name :"+ name);
		System.out.println("flower price :"+ this.price);
		System.out.println("flower weight :"+ this.weight);
		System.out.println("flower color :"+ colors.RED);
		System.out.println("flower quantity :"+ quantity);
	}
	public void totalPrice() {
		double total=price*weight;
		System.out.println("total price of flower :"+ total);
	}
	

}
