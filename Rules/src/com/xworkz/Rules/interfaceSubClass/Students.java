package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.CollageRules;

public class Students implements CollageRules{

	@Override
	public boolean timeMangement() {
		System.out.println("Running the time mangement method.....");
		return false;
	}

	@Override
	public boolean studySkills() {
		System.out.println("Running the study skills method.....");
		return false;
	}

	@Override
	public double fees(double fees) {
		System.out.println("Running the fees method.....");
		return 0;
	}

	@Override
	public boolean stressMangement() {
		System.out.println("Running the stress mangement method.....");
		return false;
	}

	@Override
	public boolean respectingRules() {
		System.out.println("Running the respecting the rules method.....");
		return false;
	}

}
