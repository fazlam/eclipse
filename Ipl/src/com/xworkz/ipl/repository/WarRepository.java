package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {
	boolean create(WarDTO dto);

	default int total() {
		return 0;

	}

	default WarDTO findByStratedBy(String stratedBy) {
		return null;
	}

	default WarDTO findByStratedByAndStratedWith(String stratedWith, String stratedBy) {
		return null;
	}

	default WarDTO StratDateGreaterThenOREqualTo(LocalDateTime date) {

		return null;
	}

	default WarDTO StratDateLesserThenOREqualTo(LocalDateTime date) {

		return null;
	}

	default WarDTO StratedDateAndEndDate(LocalDateTime strat, LocalDateTime end) {
		return null;
	}
}
