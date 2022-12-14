package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaRepositorImpl implements PizzaRepositor{
	
	private PizzaDTO[]pizzaDto=new PizzaDTO[5];
	private int pizzaIndex=0;

	@Override
	public boolean create(PizzaDTO dto) {
		System.out.println("running the create method..");
		if(this.pizzaIndex>=this.pizzaDto.length) {
			System.err.println("pizza exceed cannot add more pizza...");
		}
		this.pizzaDto[this.pizzaIndex]=dto;
		System.out.println("save dto " + dto + "in index " + this.pizzaIndex);
		return true;
	}
	@Override
	public int total() {
		return PizzaRepositor.super.total();
	}

}
