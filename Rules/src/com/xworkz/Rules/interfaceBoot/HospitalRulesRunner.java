package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.HospitalRules;
import com.xworkz.Rules.interfaceSubClass.PeopleToFollow;

public class HospitalRulesRunner {

	public static void main(String[] args) {
		
		HospitalRules hospitalRules = new PeopleToFollow();
		hospitalRules.dressCode();
		hospitalRules.fees(500);
		hospitalRules.maintainClean();
		hospitalRules.wereSaftyGear();
		hospitalRules.name("City hospital");
		
		System.out.println("================================================");
		
		PeopleToFollow peopleToFollow = new PeopleToFollow();
		peopleToFollow.dressCode();
		peopleToFollow.fees(600);
		peopleToFollow.maintainClean();
		peopleToFollow.name("balte hospital");
		peopleToFollow.wereSaftyGear();

	}

}
