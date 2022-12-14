package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public class WarRepositoryImpl implements WarRepository {

	private WarDTO[] warDto = new WarDTO[2];
	private int warIndex = 0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running the create war DTO.." + dto);
		if (this.warIndex >= this.warDto.length) {
			System.err.println("wars exceed cannot add more war...");

		}
		this.warDto[this.warIndex] = dto;
		System.out.println("save dto " + dto + "in index " + this.warIndex);
		this.warIndex++;
		return true;
	}

	@Override
	public int total() {
		return WarRepository.super.total();
	}

	@Override
	public WarDTO findByStratedBy(String stratedBy) {
		System.out.println("findByStratedBy is running.....");
		for (WarDTO warDTO2 : warDto) {
			if (warDTO2 != null && warDTO2.getStartedBy().equalsIgnoreCase(stratedBy)) {
				System.out.println(" war dto is found " + stratedBy);
				return null;
			}

		}
		return WarRepository.super.findByStratedBy(stratedBy);
	}

	@Override
	public WarDTO findByStratedByAndStratedWith(String stratedWith, String stratedBy) {
		System.out.println("findByStratedByAndStratedWith is created....");
		for (WarDTO warDTO3 : warDto) {
			if (warDTO3 != null && warDTO3.getStartedBy().equalsIgnoreCase(stratedBy)
					& warDTO3.getStaredWith().equalsIgnoreCase(stratedWith)) {
				System.out.println("War dto is found-" + stratedWith + " " + stratedBy);
				return warDTO3;
			}
		}
		return WarRepository.super.findByStratedByAndStratedWith(stratedWith, stratedBy);
	}

	@Override
	public WarDTO StratDateGreaterThenOREqualTo(LocalDateTime date) {
		System.out.println("StratDateGreaterThenOREqualTo is found and created.....");
		for (WarDTO warDTO4 : warDto) {
			if (warDTO4 != null && warDTO4.getStartedDate().isAfter(date)) {
				System.out.println("War dto is found-" + date);
				return warDTO4;
			}

		}
		return WarRepository.super.StratDateGreaterThenOREqualTo(date);
	}

	@Override
	public WarDTO StratDateLesserThenOREqualTo(LocalDateTime date) {
		System.out.println("StratDateLesserThenOREqualTo  is found and created.....");
		for (WarDTO warDTO5 : warDto) {
			if (warDTO5 != null && warDTO5.getStartedDate().isBefore(date)) {
				System.out.println("war dto is found-" + date);
				return warDTO5;
			}

		}
		return WarRepository.super.StratDateLesserThenOREqualTo(date);
	}

	@Override
	public WarDTO StratedDateAndEndDate(LocalDateTime strat, LocalDateTime end) {
		System.out.println("StratedDateAndEndDate is found ");
		for (WarDTO warDTO6 : warDto) {
			if (warDTO6 != null && warDTO6.getStartedDate().equals(strat) & warDTO6.getEndedDate().equals(end)) {
				System.out.println("war is found -" + strat + "-" + end);
				return warDTO6;
			}

		}
		return WarRepository.super.StratedDateAndEndDate(strat, end);
	}

}
