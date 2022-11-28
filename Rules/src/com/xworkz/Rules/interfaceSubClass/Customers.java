package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.OyoRules;

public class Customers implements OyoRules {

	@Override
	public boolean idPoorf() {
		System.out.println("Running the oyo id poorf method....");
		return false;
	}

	@Override
	public int age() {
		System.out.println("Running the oyo age limit method....");
		return 0;
	}

	@Override
	public boolean customerSafty() {
		System.out.println("Running the oyo customer safty method....");
		return false;
	}

	@Override
	public double roomPrice() {
		System.out.println("Running the oyo room price method....");
		return 0;
	}

	@Override
	public boolean bookingMethod() {
		System.out.println("Running the oyo room booking  method....");
		return false;
	}

}
