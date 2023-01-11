package com.xworkz.spring.confirambo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.rambo.Actore;
import com.xworkz.spring.rambo.Mobile;
import com.xworkz.spring.rambo.Rocket;
import com.xworkz.spring.rambo.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class RocketConfiguration {

	public RocketConfiguration() {
		System.out.println("Create the Rocket by useing the spring...");
	}

	@Bean
	public Rocket getRocket() {
		System.out.println("Registeringn another Rocket in spring...");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actore show() {
		System.out.println("Registring the actore by speing...");
		Actore actore = new Actore("Shaharuk khan", "Hindi", 52);
		return actore;
	}

	@Bean("kala")
	public Season getSeason() {
		System.out.println("Registering the season by spring...");
		Season season = new Season();
		season.setDuration(2);
		season.setName("summer");
		season.setStartingMounth("march");
		return season;
	}

	@Bean
	public Mobile use() {
		Mobile mobile = new Mobile("b", 435D);
		return mobile;
	}

}
