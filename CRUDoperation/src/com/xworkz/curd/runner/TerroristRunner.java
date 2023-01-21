package com.xworkz.curd.runner;

import com.xworkz.curd.dto.TerroristDTO;
import com.xworkz.curd.serivice.TerroristImpl;
import com.xworkz.curd.serivice.TerroristService;

public class TerroristRunner {

	public static void main(String[] args) {
	
		TerroristDTO dtos=new TerroristDTO();
		dtos.setName("dowud");
		dtos.setCountry("pakistan");
		dtos.setAlive(true);
		dtos.setPrison(true);
		dtos.setAge(20);
		dtos.setOrganisation("Laewaris");
		
		System.out.println(dtos.getAge());
		System.out.println(dtos.getName());
		System.out.println(dtos.getCountry());
		System.out.println(dtos.isAlive());
		System.out.println(dtos.isPrison());
		System.out.println(dtos.getOrganisation());
		 TerroristService service= new TerroristImpl();
		 service.validateAndSave(dtos);
		
	
	
	
	
	
	}
	

}
