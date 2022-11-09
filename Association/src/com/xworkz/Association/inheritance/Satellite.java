package com.xworkz.Association.inheritance;

public class Satellite extends Moon{
	
	public String name;
	
	
	public Satellite(String color, boolean since) {
		super(color, since);
		
	}
	public Satellite(String color, boolean since,String name)
	{
		super(color,since);
		this.name=name;
	}
    
	public void showMoon()
	{
		super.showMoon();
		System.out.println(this.name);
		
	}
	
	

}
