package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
	System.out.println("Running validate And save..." + dto);
	String name=dto.getName();
	boolean validName=false;
	if(name !=null && name.length()>=4 && name.length()<=20) {
		System.out.println("valid pizza name :" + name);
		validName=true;
	}else {
		System.err.println("invalid pizza name :" + name);
	}
	String company=dto.getCompany();
	boolean validCompany=false;
	if(company !=null && company.length()>=4 && company.length()<20) {
	System.out.println("valid company .." + company);
	validCompany=true;
	}else {
	System.err.println("invalid company.." + company);	
	}
	PizzaSize pizzaSize = dto.getSize();
	boolean validSize=false;
	if(pizzaSize !=null) {
		System.out.println("valid pizza size " + pizzaSize);
		validSize=true;
	}else {
		System.err.println("invalid pizza Size " + pizzaSize);
	}
	double price=dto.getPrice();
	boolean validPrice=false;
	if(price>50 && price<12000) {
		System.out.println("valid price.." + price);
		validPrice=true;
	}else {
		System.out.println("invalid price " + price);
	}
	String flavour=dto.getFlavour();
	boolean validFlavour=false;
	if(flavour !=null && flavour.length()>3 && flavour.length()<20) {
		System.out.println("valid flavour..." + flavour);
		validFlavour=true;
	}else {
		System.err.println("invalid flavour " + flavour);
	}
	String type=dto.getType();
	boolean validType=false;
	if(type != null && type=="VEG" || type=="NONVEG") {
		System.out.println("valid type .." + type);
		validType=true;
	}else {
		System.err.println("invalid type pizaa.." + type);
	}
	
		return true;
	}

}
