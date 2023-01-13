package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	private Location location;
	@Autowired
	public Company() {
		System.out.println("Craete the location by no arg const..");
	}

}
