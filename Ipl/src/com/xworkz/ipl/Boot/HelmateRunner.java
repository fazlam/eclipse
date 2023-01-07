package com.xworkz.ipl.Boot;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.dto.HelemetDTO;
import com.xworkz.ipl.repository.HelemetRepositorImpl;
import com.xworkz.ipl.repository.HelemetRepository;
import com.xworkz.ipl.service.HelemetService;
import com.xworkz.ipl.service.HelemetServiceImpl;

public class HelmateRunner {

	public static void main(String[] args) {
		HelemetDTO helemetDTO=new HelemetDTO("Blue dart","Semi half",Color.BLACK,1200D);
		HelemetRepository helemetRepository=new HelemetRepositorImpl();
		HelemetService helemetService=new HelemetServiceImpl(helemetRepository);
		boolean success= helemetService.validateAndSave(helemetDTO);
		//System.out.println("success"+success);

	}

}
