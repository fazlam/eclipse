package com.xworkz.Association.Runner;

import com.xworkz.Association.inheritance.fun;

public class BachelorPartyRunner {

	public static void main(String[] args) {
	
		fun fun = new fun("benglore","pool type",10);
		
		System.out.println("party location:"+ fun.location);
		System.out.println("no of people:"+ fun.noOfPepole);
		System.out.println("party type:"+ fun.type);

	}

}
