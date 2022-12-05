package com.xworkz.exception.rules;

public interface KaranakaRTO extends TranspotRule {
	

	@Override
	default boolean paidTax(double amount) {
		System.out.println("printing the paid tax method");
		return false;
	}

	@Override
	default double gst() {
		System.out.println("printing the gst method");
		return 0;
	}
	double vat();

}
