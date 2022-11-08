package com.xworkz.Association.Runner;

import com.xworkz.Association.inheritance.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		
		
		Catering Catering =new Catering(10,"birayni","gulab jamoon");
		
		System.out.println("food name:"+ Catering.foodName);
		System.out.println("no of food "+ Catering.noOfFood);
		System.out.println("sweet name:"+ Catering.sweetName);

	}

}
