package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.VinodaMamRules;

public class Trainees implements VinodaMamRules {

	@Override
	public boolean prsenteation() {
		System.out.println("Running the prsentation method....");
		return false;
	}

	@Override
	public boolean regulerClass() {
		System.out.println("Running the regular clases method....");
		return false;
	}

	@Override
	public boolean timeMangement() {
		System.out.println("Running the time mangement method....");
		return false;
	}

	@Override
	public boolean goodBeheveir() {
		System.out.println("Running the good behevier method....");
		return false;
	}

	@Override
	public boolean studentInfo() {
		System.out.println("Running the student Info method....");
		return false;
	}

}
