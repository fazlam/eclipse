package com.xworkz.soldier.runner;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierService;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("Naru",1, "Topper","Xworkz","Indai");
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierRepoImpl repo=new SoldierRepoImpl();
		repo.save(dto);
		
		
	}

}
