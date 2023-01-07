package com.xworkz.exception.SubClass;

import com.xworkz.exception.rules.KaranakaRTO;

public class Fazlam extends JavaTrainee implements KaranakaRTO {

	@Override
	public double vat() {
		System.out.println("Running the vat method......");
		return 0;
	}
	

}
