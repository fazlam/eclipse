package com.xworkz.collation.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collation.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO> ApplicationDTO=new ArrayList<ApplicationDTO>();
		
		ApplicationDTO.add(new ApplicationDTO("Google Maps",4.5, true,true,0));
		ApplicationDTO.add(new ApplicationDTO("WhatsApp",8.2, true,false,0));
		ApplicationDTO.add(new ApplicationDTO("Instagarm",5.3, false,false,1000));
		ApplicationDTO.add(new ApplicationDTO("PhonePe",7.5,false,false,100));
		
		ApplicationDTO.stream().filter(dto->dto.getDevelopedBy() && dto.isFree()).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		System.out.println("==============");
		ApplicationDTO.stream().filter(dto->dto.getVersion()>5).collect(Collectors.toList()).forEach(freq->System.out.println(freq));
		
	

	}

}
