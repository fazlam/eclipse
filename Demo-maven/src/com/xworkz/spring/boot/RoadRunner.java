package com.xworkz.spring.boot;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.ApplicationConfiguration;
import com.xworkz.spring.configuration.AreaSpringConfiguration;
import com.xworkz.spring.configuration.BusSpringConfiguration;
import com.xworkz.spring.configuration.ChocolateSpringConfiguration;
import com.xworkz.spring.configuration.CitySpringConfiguration;
import com.xworkz.spring.configuration.CycleSpringConfiguration;
import com.xworkz.spring.configuration.FishSpringConfiguration;
import com.xworkz.spring.configuration.GirlSpringConfiguration;
import com.xworkz.spring.configuration.GodSpringConfiguration;
import com.xworkz.spring.configuration.MallSpringConfiguration;
import com.xworkz.spring.configuration.MaskSpringConfiguration;
import com.xworkz.spring.configuration.MilkSpringConfiguration;
import com.xworkz.spring.configuration.ParkSpringConfiguration;
import com.xworkz.spring.configuration.PatientSpringConfiguration;
import com.xworkz.spring.configuration.RoadSpringConfiguration;
import com.xworkz.spring.configuration.TempleSpringConfiguration;

public class RoadRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(RoadSpringConfiguration.class);
		ApplicationContext spring1=new AnnotationConfigApplicationContext(BusSpringConfiguration.class);
		ApplicationContext spring2=new AnnotationConfigApplicationContext(CycleSpringConfiguration.class);
		ApplicationContext spring3=new AnnotationConfigApplicationContext(GirlSpringConfiguration.class);
		ApplicationContext spring4=new AnnotationConfigApplicationContext(MilkSpringConfiguration.class);
		ApplicationContext spring5=new AnnotationConfigApplicationContext(MaskSpringConfiguration.class);
		ApplicationContext spring6=new AnnotationConfigApplicationContext(PatientSpringConfiguration.class);
		ApplicationContext spring7=new AnnotationConfigApplicationContext(ChocolateSpringConfiguration.class);
		ApplicationContext spring8=new AnnotationConfigApplicationContext(AreaSpringConfiguration.class);
		ApplicationContext spring9=new AnnotationConfigApplicationContext(CitySpringConfiguration.class);
		ApplicationContext spring10=new AnnotationConfigApplicationContext(FishSpringConfiguration.class);
		ApplicationContext spring11=new AnnotationConfigApplicationContext(TempleSpringConfiguration.class);
		ApplicationContext spring12=new AnnotationConfigApplicationContext(GodSpringConfiguration.class);
		ApplicationContext spring13=new AnnotationConfigApplicationContext(ParkSpringConfiguration.class);
		ApplicationContext spring14=new AnnotationConfigApplicationContext(MallSpringConfiguration.class);
		ApplicationContext spring15=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		

	}

}
