package com.xworkz.Association.inheritance;

public class ShoppingMall extends Orian{
	
	
	public String location;
	
	public ShoppingMall(String type, int noOfScreen) {
		super(type, noOfScreen);
	
	}
	public ShoppingMall(String type, int noOfScreen,String location) {
		super(type,noOfScreen);
		this.location=location;
		
		
	}
	public void display() {
		super.display();
		System.out.println(this.location);
	}

	
	
	

}
