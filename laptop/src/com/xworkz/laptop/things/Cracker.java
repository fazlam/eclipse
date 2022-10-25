package com.xworkz.laptop.things;

import constant.brands;

public class Cracker {
	public static String shopName="patake shop";
	public brands brand=brands.LAKSHIMI;
	public double price;
	public double quantity;
	public String type;
	
	static {
		
	}
	public Cracker(String type)
	{
		this.type=type;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void showValue()
	{
		System.out.println("shopeName :" + shopName);
		System.out.println( "cracker brand :" + brand.LAKSHIMI);
		System.out.println("cracker type :" + this.type);
		System.out.println("cracker price :"+ this.price);
		System.out.println("cracker quantity :"+ this.quantity);
	}
	public void totalPrice()
	{
		double total=price*quantity;
		System.out.println("total price :"+ total);
	}
	
	
	
	

}
