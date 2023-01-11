package com.xworkz.spring.rambo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private int duration;
	private String startingMounth;

	public Season() {
		System.out.println("Def.const..");
	}

	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}

	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Value("October")
	public void setStartingMounth(String startingMounth) {
		this.startingMounth = startingMounth;
	}

	public int getDuration() {
		return duration;
	}

	public String getName() {
		return name;
	}

	public String getStartingMounth() {
		return startingMounth;
	}

}
