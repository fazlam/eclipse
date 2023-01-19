package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
@Component
public class MissileRepoImpl implements MissileRepo{

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Running the Save in the no argu const.");
		System.out.println("MissileDTO" +dto);
		return false;
	}

}
