package com.xworkz.spring.rambo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String name;
	private Double price;

	public Mobile(@Value("a")String name, @Value("234D")Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}

}
