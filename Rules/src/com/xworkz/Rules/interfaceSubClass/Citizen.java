package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.TrafficRule;

public class Citizen implements TrafficRule    {
	
	@Override
	public boolean wereSeatBelt() {
		System.out.println("Running the were seat blet method....");
		return false;
	}

	@Override
	public double speedLimits(int speedLimits) {
		System.out.println("Running the speed limit method....");
		return 0;
	}

	@Override
	public boolean wereHalment() {
		System.out.println("Running the were halment method....");
		return false;
	}

	@Override
	public boolean trippleRiding() {
		System.out.println("Running the tripple riding method....");
		return false;
	}

	@Override
	public boolean followSignals() {
		System.out.println("Running the follow signals method....");
		return false;
	}

	

}
