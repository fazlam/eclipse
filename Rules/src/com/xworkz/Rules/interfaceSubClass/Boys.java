package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.PgRules;

public class Boys implements PgRules {

	@Override
	public boolean openTime() {
		System.out.println("Running the pg open time method....");
		return false;
	}

	@Override
	public boolean closeTime() {
		System.out.println("Running the pg close time method....");
		return false;
	}

	@Override
	public double advanced() {
		System.out.println("Running the advanced mony method....");
		return 0;
	}

	@Override
	public double rent() {
		System.out.println("Running the pg rent method....");
		return 0;
	}

	@Override
	public boolean noFoodWest() {
		System.out.println("Running the pg no food wested method....");
		return false;
	}

}
