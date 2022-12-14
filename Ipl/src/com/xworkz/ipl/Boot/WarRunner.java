package com.xworkz.ipl.Boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {
		WarRepository repositor =new WarRepositoryImpl();
		WarDTO dto =new WarDTO();
		dto.setWarName("Frist Kashmir war");
		dto.setStartedBy("Pakistan");
		dto.setStaredWith("India");
		dto.setNoOfDeaths(5000);
		repositor.create(dto);
		repositor.findByStratedBy("Pakistan");
		repositor.findByStratedByAndStratedWith("Pakistan", "India");
		repositor.StratDateGreaterThenOREqualTo(LocalDateTime.MAX);
		repositor.StratDateLesserThenOREqualTo(LocalDateTime.now());
		repositor.StratedDateAndEndDate(LocalDateTime.now(), LocalDateTime.now());

	}

}
