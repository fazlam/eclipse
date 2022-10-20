package com.xworkz.work;

public class Tractore {

	public String name;
	public String brand;
	public long price;
	public String color;
	public int hp;
	public int model;
	
	public Tractore()
	{
		super();
		System.out.println("creating");
	}
	public Tractore(String name)
	{
		this();
		this.name=name;
		System.out.println("Tractore name");
	}
	public Tractore(long price)
	{
		this("name");
		this.price=price;
		System.out.println("Tractore price");
	}
	public Tractore(int hp)
	{
		this("price");
		this.hp=hp;
		System.out.println("Tractore hp");
	}
	
	
}
