package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo{



	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running the Save in the no argu const.");
		System.out.println("ResortDTO" +dto);
		return false;
	}

}
