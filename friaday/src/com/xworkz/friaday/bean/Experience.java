package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	private Skill skill;
	
	public Experience() {
	
		System.out.println("Create the Experince by useing the no argu const");
	
	}

}
