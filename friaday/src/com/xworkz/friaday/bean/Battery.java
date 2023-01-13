package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;
	
	public Battery() {
		System.out.println("Create the battery by useing the no argu const");
	}

}
