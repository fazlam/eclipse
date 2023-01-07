package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.Development;
import com.xworkz.Rules.interfaceClass.TrafficRule;

public class Xworkz implements Development,TrafficRule {

	@Override
	public boolean placement() {
    System.out.println("Running the placement method...from Institute");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("Running the training method...from Institute");
		return false;
	}

	@Override
	public boolean wereSeatBelt() {
		System.out.println("Running the were seat belt method...from Traffic rule");
		return false;
	}

	@Override
	public double speedLimits(int speedLimits) {
		System.out.println("Running the were speed limit method...from Traffic rule");
		return 0;
	}

	@Override
	public boolean wereHalment() {
		System.out.println("Running the were were halment method...from Traffic rule");
		return false;
	}

	@Override
	public boolean trippleRiding() {
		System.out.println("Running the tripple riding method...from Traffic rule");
		return false;
	}

	@Override
	public boolean followSignals() {
		System.out.println("Running the follow signals method...from Traffic rule");
		return false;
	}

	@Override
	public boolean interview() {
		System.out.println("Running the interview method...from Development");
		return false;
	}

}
