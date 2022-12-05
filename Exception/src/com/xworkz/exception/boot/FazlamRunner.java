package com.xworkz.exception.boot;

import com.xworkz.exception.SubClass.Fazlam;

public class FazlamRunner {

	public static void main(String[] args) {
		Fazlam fazlam = new Fazlam();
		fazlam.completedProgram();
		fazlam.getAge();
		fazlam.getName();
		fazlam.getPlace();
		fazlam.getWeight();
		fazlam.gst();
		fazlam.isWork();
		fazlam.paidTax(10000);
		fazlam.setAge(25);
		fazlam.setName("fazlam");
		fazlam.setPlace("bidar");
		fazlam.setWeight(50);
		fazlam.setWork(true);
		fazlam.vat();
		
		System.out.println("person age is :"+ fazlam.getAge());
		System.out.println("person weight is :"+ fazlam.getWeight());
		System.out.println("person place is :"+ fazlam.getPlace());
		System.out.println("person name is :"+ fazlam.getName());
		System.out.println("person work is :"+ fazlam.isWork());

	}

}
