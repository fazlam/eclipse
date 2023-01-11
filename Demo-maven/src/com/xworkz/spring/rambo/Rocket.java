package com.xworkz.spring.rambo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("Atlas Rocket")
	private String name;
	@Value("India")
	private String country;
	@Value("1500000")
	private double budget;

	public Rocket() {
		System.out.println("Created Rocket by useing no argu const...... ");
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public double getBudget() {
		return budget;
	}

}
