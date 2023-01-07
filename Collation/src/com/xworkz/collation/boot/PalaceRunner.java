package com.xworkz.collation.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collation.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> PlaceDTO=new ArrayList<PalaceDTO>();
		PlaceDTO.add(new PalaceDTO("Bengaluru Palace","Bengaluru","Om sir", false, 500));
		PlaceDTO.add(new PalaceDTO("Mysore Palace","Mysore","prshant",true, 400));
		PlaceDTO.add(new PalaceDTO("Rambhag Palace","jaipure","Rudresh", false, 300));
		PlaceDTO.add(new PalaceDTO("Taj Falakunuma Palace","Hyderabad","Fazlam", false, 1000));
		PlaceDTO.add(new PalaceDTO("Taj Lake Palace","jaipure","Vinye", true, 600));
		
		PlaceDTO.stream().filter(dto->!dto.isDestroyed()).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));

	}

}
