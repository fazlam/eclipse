package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PizzaDTO;

public interface PizzaRepositor {
	
	boolean create(PizzaDTO dto);
	default int total() {
		return 0;
	}
	

}
