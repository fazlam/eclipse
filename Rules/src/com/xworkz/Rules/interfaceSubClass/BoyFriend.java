package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.GirlsFrindRules;

public class BoyFriend implements GirlsFrindRules{

	@Override
	public boolean beHonest() {
		System.out.println("Running the be honest method........");
		return false;
	}

	@Override
	public boolean dontShearSecreats() {
		System.out.println("Running the dont shear secreats method........");
		return false;
	}

	@Override
	public boolean neverCheat() {
		System.out.println("Running the never cheat  method........");
		return false;
	}

	@Override
	public boolean permission() {
		System.out.println("Running the permission method........");
		return false;
	}

	@Override
	public boolean morePriority() {
		System.out.println("Running the more prioity method........");
		return false;
	}

}
