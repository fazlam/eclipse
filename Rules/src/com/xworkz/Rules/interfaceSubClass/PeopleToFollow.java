package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.HospitalRules;

public class PeopleToFollow implements HospitalRules {

	@Override
	public String name(String name) {
		System.out.println("Running the hospital name method....");
		return null;
	}

	@Override
	public boolean dressCode() {
		System.out.println("Running the hospital Dress code method....");		
		return false;
	}

	@Override
	public boolean maintainClean() {
		System.out.println("Running the hospital clean maitained method....");
		return false;
	}

	@Override
	public boolean wereSaftyGear() {
		System.out.println("Running the hospital were safty gear method....");
		return false;
	}

	@Override
	public double fees(double fees) {
		System.out.println("Running the hospital fees method....");
		return 0;
	}

}
