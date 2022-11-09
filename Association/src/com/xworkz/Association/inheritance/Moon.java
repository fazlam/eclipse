package com.xworkz.Association.inheritance;

public class Moon {
	public String color;
	public boolean since;
	
	
	public Moon(String color, boolean since) {
		super();
		this.color = color;
		this.since = since;
	}
	
	public void showMoon() {
		System.out.println(this.color);
		System.out.println(this.since);
	}
	

}
