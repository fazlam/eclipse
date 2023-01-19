package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.repo.MissileRepo;
@Component
public class MissileServiceImpl implements MissileService {
	
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;
	
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo=missileRepo;
		System.out.println("create service by passing repo");
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Running validate and save");
		System.out.println("dto save :"+ dto);
		Set<ConstraintViolation<MissileDTO>> vilation=this.validator.validate(dto);
		if(!vilation.isEmpty()) {
			System.out.println("Violation is prsent");
			vilation.forEach(cv->System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Date is valid &can we save");
			boolean saved=this.missileRepo.save(dto);
			return saved;
		}
		
		
	}

}
