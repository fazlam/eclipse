package com.xworkz.spring.rambo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actore {
	
	private String name;
	private String lang;
	private int age;
	
	public Actore(@Value("salman khan") String name, @Value ("hindi")String lang, @Value("50") int age) {
		super();
		this.name = name;
		this.lang = lang;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getLang() {
		return lang;
	}
	public int getAge() {
		return age;
	}

}
