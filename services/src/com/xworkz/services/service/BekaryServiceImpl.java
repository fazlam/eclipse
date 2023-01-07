package com.xworkz.services.service;

import com.xworkz.services.constant.FamousFor;
import com.xworkz.services.dto.BekaryDTO;
import com.xworkz.services.exception.InvalidBekarydata;
import com.xworkz.services.repository.BekaryERepository;

public class BekaryServiceImpl implements BekaryService{
	
	private BekaryERepository repository;
	
	public  BekaryServiceImpl(BekaryERepository repository) {
		this.repository=repository;
		System.out.println("calling the BekaryRepository...");
	}
    
	@Override
	public boolean validateAndSave(BekaryDTO dto) throws InvalidBekarydata {
		System.out.println("Running the validateAndSave....." + dto);
		
		String name=dto.getName();
		String ownerName=dto.getOwnerName();
		String location=dto.getLocation();
		long contactNo=dto.getContactNo();
		FamousFor famousFor=dto.getFamousFor();
		boolean validName=false;
		boolean validOwnerName=false;
		boolean validLocation=false;
		boolean validContact=false;
		boolean validFamous=false;
		
		if(name !=null && name.length()>5 && name.length()<20) {
			System.out.println("valid name.." + dto);
			validName=true;
		}else {
			System.err.println("invalid name.. " +dto);
		}
		if(ownerName !=null && ownerName.length()>5 && ownerName.length()<20)
		{
			System.out.println("valid owner name.." +dto);
			validOwnerName=true;
		}else {
			System.err.println("invalid ownerName.." + dto);
		}
		if(location !=null && location.length()>5 && location.length()<20) {
			System.out.println("valid location..." + dto);
			validLocation=true;
		}else {
			System.err.println("invalid location .." + dto);
		}
		if(contactNo>10 &&contactNo<3) {
			System.out.println("valid contact no.." + dto);
			validContact=true;
		}else {
			System.out.println("invalid contact no.." +dto);
		}
		if(validName && validOwnerName && validLocation && validContact) {
			System.out.println("Data is valid you can store..");
			boolean saved =this.repository.store(dto);
			System.out.println("data is saved successfuly.." + saved);
			return saved;
		}
		throw new InvalidBekarydata("check the data ..somthing is worng...");
	  
		
		
	}

}
