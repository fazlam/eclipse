package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.CollageRules;
import com.xworkz.Rules.interfaceSubClass.Students;

public class CollageRulesRunner {

	public static void main(String[] args) {
		CollageRules collageRules = new Students();
		collageRules.fees(100000);
		collageRules.respectingRules();
		collageRules.stressMangement();
		collageRules.studySkills();
		collageRules.timeMangement();
		
		System.out.println("===================================================");
		Students students = new Students();
		students.respectingRules();
		students.fees(200000);
		students.respectingRules();
		students.stressMangement();
		students.timeMangement();
		

	}

}
