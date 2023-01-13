package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	
	public Camera() {
		System.out.println("Create the camera by useing the no argu const");
	}

}
