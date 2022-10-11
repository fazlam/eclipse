package com.xworkz.copy;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Chocolate name=new Chocolate();
		System.out.println(name.Name);
		
		Chocolate brand=new Chocolate();
		System.out.println(brand.brand);
		
		Chocolate price=new Chocolate();
		System.out.println(price.price);
		
		Chocolate test=new Chocolate();
		System.out.println(test.flavoure);
		
		
		name.Name="Munch";
		brand.brand="Nestle";
		price.price=20;
		test.flavoure="chocolate";
		
		
		
		System.out.println(name.Name);
		System.out.println(brand.brand);
		System.out.println(price.price);
		System.out.println(test.flavoure);
		
		

	}

}
