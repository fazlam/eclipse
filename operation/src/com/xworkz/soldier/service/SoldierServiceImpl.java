package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService{
	
	private SoldierRepo soldierRepo;


	public SoldierServiceImpl() {
	System.out.println("Created soldier service impl bu useing no argu const..");
	}
	public void SetSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo;
	}
	

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Strating validate AND save ..");
		System.out.println("dto passed :" + dto);
		
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation=validator.validate(dto);
		if(!violation.isEmpty()) {
			System.err.println("There are validatore errors..");
			
			violation.forEach(v->{System.out.println("violating message "+v.getMessage());});
			return false;
		}else {
			System.out.println("data is valid");
			boolean saved=soldierRepo.save(dto);
			
			System.out.println("DTO saved useing repo :"+saved);
			return saved;
		}
		
	}
		
	

}
