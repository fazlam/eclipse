package com.xworkz.services.repository;

import com.xworkz.services.dto.BekaryDTO;
import com.xworkz.services.exception.BekaryLimitAexcced;

public class BekaryRepositoryImpl implements BekaryERepository{
	private BekaryDTO[]Dtos=new BekaryDTO[5];
	private int liveIndex=0;
	

	@Override
	public boolean store(BekaryDTO dto) {
		System.out.println("Running the BekaryDTO....." + dto);
		if(this.liveIndex>=this.Dtos.length) {
			System.err.println("can not be add more Bekary.....");
		}
		this.Dtos[this.liveIndex]=dto;
		System.out.println("save in " + dto + "in insex " + this.liveIndex);
		liveIndex++;
		throw new BekaryLimitAexcced();
		
		
		
	}

}
