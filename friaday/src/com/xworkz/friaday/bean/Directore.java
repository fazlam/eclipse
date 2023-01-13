package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Directore {
	@Autowired
	private Experience experience;
	
	public Directore() {
		System.out.println("Create the Directore by useing the no argu const");
	}

}
