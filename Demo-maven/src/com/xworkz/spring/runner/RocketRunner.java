package com.xworkz.spring.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.confirambo.RocketConfiguration;
import com.xworkz.spring.rambo.Actore;
import com.xworkz.spring.rambo.Mobile;
import com.xworkz.spring.rambo.Rocket;
import com.xworkz.spring.rambo.Season;

public class RocketRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(RocketConfiguration.class);
		String[] a = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(a));
		Rocket refOfRocket = container.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getBudget());

		Rocket refOfRocket2 = container.getBean("getRocket",Rocket.class);
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getBudget());

		System.out.println("=========================");

		Actore refOfActore = container.getBean("actore",Actore.class);
		System.out.println(refOfActore);
		System.out.println(refOfActore.getName());
		System.out.println(refOfActore.getLang());
		System.out.println(refOfActore.getAge());

		Actore refOfActore2 = container.getBean("show",Actore.class);
		System.out.println(refOfActore2.getName());
		System.out.println(refOfActore2.getLang());
		System.out.println(refOfActore2.getAge());

		System.out.println("=========================");

		Season refOfSeason = container.getBean("season",Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartingMounth());
		System.out.println("~~~~~~");
		Season refOfSeason2 = container.getBean("kala",Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getDuration());
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartingMounth());


		Mobile ref = container.getBean("mobile",Mobile.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getPrice());
		Mobile ref2 = container.getBean("use",Mobile.class);
		System.out.println(ref2);
		System.out.println(ref2.getName());
		System.out.println(ref2.getPrice());

	}

}
