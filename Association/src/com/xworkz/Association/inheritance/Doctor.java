package com.xworkz.Association.inheritance;

public class Doctor{
	public String name;
	public String gender;
  
	public Doctor(String name,String gender) {
		this.name=name;
		this.gender=gender;
		
		System.out.println(this.name);
		System.out.println(this.gender);
	
	}
}
