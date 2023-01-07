package com.xworkz.services.boot;

import com.xworkz.services.constant.FamousFor;
import com.xworkz.services.dto.BekaryDTO;
import com.xworkz.services.repository.BekaryERepository;
import com.xworkz.services.repository.BekaryRepositoryImpl;
import com.xworkz.services.service.BekaryService;
import com.xworkz.services.service.BekaryServiceImpl;

public class BekaryRunner {

	public static void main(String[] args) {
		BekaryDTO bekaryDto=new BekaryDTO("preshant bekary","preshant","Yadgir",1000,FamousFor.EGG_PUF);
		BekaryERepository repositor=new BekaryRepositoryImpl();
		BekaryService service=new BekaryServiceImpl(repositor);

	}

}
