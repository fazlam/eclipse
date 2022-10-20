package com.xworkz.work;

public class Fish {
public String Name;
public String Type;
public int Price;
public double Weight;
public String Lenght;

public Fish(){
	System.out.println("Created Fish Defaulte Value");  // 
	
}
public Fish(String Name,String Type)  
{
	this.Name=Name;
	this.Type=Type;
	System.out.println("Name and Type of the Fish");
}

public Fish(String Name,int Price)
{
	this.Name=Name;
	this.Price=Price;
	System.out.println("Name and Price of the Fish");
}

public Fish(int Price,double Weight)
{
	this.Price=Price;
	this.Weight=Weight;
}

public Fish(double Weight,String Lenght,int Price)
{
	this.Weight=Weight;
	this.Lenght=Lenght;
}


	
}
