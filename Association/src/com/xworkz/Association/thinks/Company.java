package com.xworkz.Association.thinks;

public class Company {
	public String name;
	public String type;
	
	
	public Company(String name,String type){
		
		this.name=name;
		this.type=type;
		
	}
	public void showOff() {
		System.out.println("company name is :"+ this.name);
		System.out.println("comapny type is :"+ this.type);
           
        	   
           
	}

}
