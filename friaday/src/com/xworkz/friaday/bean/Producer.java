package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
private Assistant assistant;

public Producer() {
	System.out.println("create the Producer by useing no argu const.");}
}
