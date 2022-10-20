package com.xworkz.work;



public class Sambar {

	public String name;
	public String type;
	public double price;
	public int quantity;
	public boolean test;
	public String[] color;
	public String[] ingredient;
	public String[] etaerNames;
	public String[] makerNames;
	public String[] storeIn;
	
	public Sambar(String name,String type,int price,int quantity,boolean test,String[]color,String[]ingredient,String[]etaerName,String[]makerName,String[]stoerIn)
	{
	 this.name=name;
	 this.type=type;
	 this.price=price;
	 this.quantity=quantity;
	 this.test=test;
	 this.color=color;
	 this.ingredient=ingredient;
	 
	 this.makerNames=makerName;
	 
	}
	 
	 public void Display()
	 {
		System.out.println(name); 
		System.out.println(type);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(test); 
	 
	 
	 for (int f = 0; f < storeIn.length; f++) {
	
		System.out.println(storeIn);
	}
	 for (int j = 0; j < color.length; j++) {
		
		System.out.println(color);
		
		
	}
	 for (int k = 0; k < ingredient.length; k++) {

		System.out.println(ingredient);
		
	}
	 for (int m = 0; m < etaerNames.length; m++) {
	
		System.out.println(etaerNames);
		
	}
	 for (int n = 0; n < makerNames.length; n++) {

		System.out.println(makerNames);
		
	}
	 
	 }
}



	
	
	
	

