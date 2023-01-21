package com.xworkz.curd.serivice;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.curd.dto.TerroristDTO;

public class TerroristImpl implements TerroristService{

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("created the validateAndSave in the TerroristImpl");
		
		System.out.println("Dto is passed");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		 Validator validator=factory.getValidator();
		 Set<ConstraintViolation<TerroristDTO>>vioalations=validator.validate(dto);
		 if(!vioalations.isEmpty()) {
			 System.out.println("Error is there");
			 vioalations.forEach(c->System.out.println(c.getMessage()));
			 return false;
		 }
		 System.out.println("No validation errors");
		 
		return true;
	}

}
