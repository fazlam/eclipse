package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	@Autowired
	private Company company;
	
	public Assistant() {
		System.out.println("create the assistant by useing no argu const.");
	}

}
