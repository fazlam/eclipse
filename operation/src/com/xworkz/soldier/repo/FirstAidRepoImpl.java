package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean Save(FirstAidDTO dto) {
		System.out.println("Running the Save in the no argu const.");
		System.out.println("FirstAidDTO" +dto);
		return false;
	}

}
