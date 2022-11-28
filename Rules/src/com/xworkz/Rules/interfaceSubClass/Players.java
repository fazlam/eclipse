package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.CricketRules;

public class Players implements CricketRules {

	@Override
	public boolean playersLimit() {
		System.out.println("Running the player limits method....");
		return false;
	}

	@Override
	public boolean bowlDeliveries() {
		System.out.println("Running the bowl deliveris limits method....");
		return false;
	}

	@Override
	public boolean humpirslimit() {
		System.out.println("Running the humpiers limits method....");
		return false;
	}

	@Override
	public boolean playerAgeLimit() {
		System.out.println("Running the player age limits method....");
		return false;
	}

	@Override
	public boolean playersSafty() {
		System.out.println("Running the player safty method....");
		return false;
	}

}
