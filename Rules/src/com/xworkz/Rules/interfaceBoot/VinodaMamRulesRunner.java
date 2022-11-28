package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.VinodaMamRules;
import com.xworkz.Rules.interfaceSubClass.Trainees;

public class VinodaMamRulesRunner {

	public static void main(String[] args) {
		VinodaMamRules vinodaMamRules = new Trainees();
		vinodaMamRules.prsenteation();
		vinodaMamRules.regulerClass();
		vinodaMamRules.studentInfo();
		vinodaMamRules.timeMangement();
		vinodaMamRules.goodBeheveir();
		
		System.out.println("============================================");
		Trainees trainees =new Trainees();
		trainees.goodBeheveir();
		trainees.prsenteation();
		trainees.studentInfo();
		trainees.timeMangement();
		trainees.regulerClass();
		

	}

}
