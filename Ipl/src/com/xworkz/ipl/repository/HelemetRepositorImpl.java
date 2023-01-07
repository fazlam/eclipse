package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.HelemetDTO;

public class HelemetRepositorImpl implements HelemetRepository{
	private HelemetDTO[]Dtos=new HelemetDTO[5];
	private int currentIndex=0;

	@Override
	public boolean save(HelemetDTO dto) {
		System.out.println("Running the save method of HelementRepositor...."+ dto);
		if(this.currentIndex>=this.Dtos.length) {
			System.err.println("size exceed cannot add more helemet...");
			//throw new Sizeexcedd
		}
		this.Dtos[this.currentIndex]=dto;
		System.out.println("save " + dto + "in index " + this.currentIndex);
		this.currentIndex++;
		return true;
	}

}
