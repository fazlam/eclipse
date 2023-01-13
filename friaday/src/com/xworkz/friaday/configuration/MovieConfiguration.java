package com.xworkz.friaday.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan("com.xworkz.friaday")
//@ComponentScan(basePackageClasses = "com.xworkz.friaday",excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value =Collection.class)})
public class MovieConfiguration {
	
	public MovieConfiguration() {
		System.out.println("Registring the MovieConfiguration by useing no arg const..");
	}

}
