package com.xworkz.ipl.Boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;
import com.xworkz.ipl.repository.PizzaRepositor;
import com.xworkz.ipl.repository.PizzaRepositorImpl;
import com.xworkz.ipl.service.PizzaService;
import com.xworkz.ipl.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaRepositor repository=new PizzaRepositorImpl();
		repository.create(null);
		
		
		PizzaDTO pizzaDTO=new PizzaDTO();
		pizzaDTO.setName("Cheese Brust");
		pizzaDTO.setCompany("Domino's");
		pizzaDTO.setPrice(1000);
		pizzaDTO.setCheese(true);
		pizzaDTO.setSize(PizzaSize.MEDIEUM);
		pizzaDTO.setFlavour("Veggi Pizza");
		pizzaDTO.setType("VEG");
		pizzaDTO.setCreatedBy("SYSTEM");
		pizzaDTO.setCreatedDate(LocalDateTime.now());
		
		PizzaService pizzaService = new PizzaServiceImpl();
		boolean saved=pizzaService.validateAndSave(pizzaDTO);
		System.out.println(saved);
	}

}
