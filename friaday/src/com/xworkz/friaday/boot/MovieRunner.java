package com.xworkz.friaday.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.friaday.bean.Movie;
import com.xworkz.friaday.configuration.MovieConfiguration;

public class MovieRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Movie movie=container.getBean(Movie.class);
		
	}

}
