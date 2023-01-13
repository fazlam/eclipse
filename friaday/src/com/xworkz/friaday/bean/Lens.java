package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	@Autowired
private Battery battery;

public Lens() {
	System.out.println("Create the Lens by useing the no argu const");
}
}
