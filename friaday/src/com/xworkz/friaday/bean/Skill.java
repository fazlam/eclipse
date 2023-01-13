package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Skill {
	@Autowired
	private CameraMan cameraMan;
	
	
	public Skill() {
		System.out.println("Create the skill by useing the no argu const");
	}

}
