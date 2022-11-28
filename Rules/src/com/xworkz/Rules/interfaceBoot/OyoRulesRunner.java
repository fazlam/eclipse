package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.OyoRules;
import com.xworkz.Rules.interfaceSubClass.Customers;

public class OyoRulesRunner {

	public static void main(String[] args) {
		OyoRules oyoRules = new Customers();
		oyoRules.age();
		oyoRules.bookingMethod();
		oyoRules.customerSafty();
		oyoRules.idPoorf();
		oyoRules.roomPrice();
		
		System.out.println("====================================");
		
		Customers customers =new Customers();
		customers.age();
		customers.bookingMethod();
		customers.customerSafty();
		customers.idPoorf();
		customers.roomPrice();

	}

}
