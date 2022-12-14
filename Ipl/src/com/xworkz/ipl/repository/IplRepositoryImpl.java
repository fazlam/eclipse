package com.xworkz.ipl.repository;

import com.xworkz.ipl.Exception.ArraySizeIsExceeded;
import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository{
	
	private IplDTO[] iplDtos = new IplDTO[10];
	private int currentIndex =0;

	@Override
	public boolean create(IplDTO dto) {
	System.out.println("Running create of IplDTO :"+ dto);
	if(this.currentIndex>=this.iplDtos.length) {
		System.err.println("size exceed cannot add more iplTeam");
		throw new ArraySizeIsExceeded();
		
	}
	this.iplDtos[this.currentIndex]=dto;
	System.out.println("saved "+ dto + "in index " + this.currentIndex );
	this.currentIndex++;
	return true;
	}
	

}
