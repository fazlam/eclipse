package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	
	public CameraMan() {
		System.out.println("Create the camera man by useing the no argu const");
	}

}
