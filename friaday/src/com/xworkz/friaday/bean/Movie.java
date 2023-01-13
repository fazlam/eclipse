package com.xworkz.friaday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Directore directore;
	@Autowired
	private Producer producer;
	
	public Movie() {
		System.out.println("Create the Directore and producer by useing the no argu const");
	}

	@Override
	public String toString() {
		return "Movie [directore=" + directore + ", producer=" + producer + "]";
	}
	
	
	

}
