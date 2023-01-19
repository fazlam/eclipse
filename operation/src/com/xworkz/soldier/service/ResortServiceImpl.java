package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repo.MissileRepo;
import com.xworkz.soldier.repo.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService{
	
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo=resortRepo;
		System.out.println("create service by passing repo");

	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Running validate and save");
		System.out.println("dto save :"+ dto);
		Set<ConstraintViolation<ResortDTO>> vilation=this.validator.validate(dto);
		if(!vilation.isEmpty()) {
			System.out.println("Violation is prsent");
			vilation.forEach(cv->System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Date is valid &can we save");
			boolean saved=this.resortRepo.save(dto);
			return saved;
		}
		
	}

}
