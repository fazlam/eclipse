package com.xworkz.Association.inheritance;

public class Orian {
	
	public String type;
	public int noOfScreen;
	
	
	public Orian(String type, int noOfScreen) {
		
		this.type = type;
		this.noOfScreen = noOfScreen;
	}
	
	public void display()
	{
		System.out.println(this.noOfScreen);
		System.out.println(this.type);
	}
	
	

}
