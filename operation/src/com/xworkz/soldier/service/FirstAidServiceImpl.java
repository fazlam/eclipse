package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.repo.FirstAidRepo;
@Component
public class FirstAidServiceImpl implements FirstAidService{
	
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	//@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		System.out.println("create service by passing repo");
		
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Running validate and save");
		System.out.println("dto save :"+ dto);
		Set<ConstraintViolation<FirstAidDTO>> vilation=this.validator.validate(dto);
		if(!vilation.isEmpty()) {
			System.out.println("Violation is prsent");
			vilation.forEach(cv->System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Date is valid &can we save");
			boolean saved=this.firstAidRepo.Save(dto);
			return saved;
		}
		
		
	}

}
