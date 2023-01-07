package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.dto.HelemetDTO;
import com.xworkz.ipl.repository.HelemetRepository;

public class HelemetServiceImpl implements HelemetService {
	private HelemetRepository helemetRepository;
	
	public HelemetServiceImpl(HelemetRepository helemetRepository) {
		this.helemetRepository=helemetRepository;
		System.out.println("Calling HelemetRepository using repo.... ");
	}

	@Override
	public boolean validateAndSave(HelemetDTO dto) {
		System.out.println("Running the valid and save method.." + dto);
		String brand=dto.getBrand();
		String type=dto.getType();
		Color color=dto.getColor();
		Double price=dto.getPrice();
		boolean validBrand=false;
		boolean validType=false;
		boolean validcolor=false;
		boolean validprice=false;
		
		if(brand !=null && brand.length()>=5 && brand.length()<=20) {
			System.out.println("valid brand.."+brand);
			validBrand=true;
		}else {
			System.err.println("invalid brand..");
		}
		if(type !=null && type.length()>=5 && type.length()<=20) {
			System.out.println("valid type.."+type);
			validType=true;
		}else {
			System.err.println("invalid type..");
		}
		if(color!=null) {
		System.out.println("valid color.."+color);
		validcolor=true;
	     }else {
		 System.err.println("invalid color..");
		 	       }
		if(price !=null && price>=500 && price<=50000) {
			System.out.println("valid pirce.."+price);
			validprice=true;
		}else {
			System.err.println("invalid price...");
			
		}
		if(validBrand && validType && validcolor && validprice) {
			System.out.println("Helemet DTO is valid,can save using repository..");
			boolean saved=this.helemetRepository.save(dto);
			System.out.println("Helemet DSTO is saved.." + saved);
			return saved;
		}else {
			System.out.println("Helemt DTO is not save ..");
		}
		return false;
		//throw new invalide("check the data u have passed")
	}

}
