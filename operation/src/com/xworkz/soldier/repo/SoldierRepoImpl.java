package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo{
	
	public SoldierRepoImpl() {
		System.out.println("Create soldier repo impl by useing no argu const..");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running tyhe save ..");
		System.out.println("dto :"+dto);
		return false;
	}

}
