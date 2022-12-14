package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class WarAuditDTO implements Serializable {
	private String startedBy;
	private LocalDateTime startedDate;
	private String staredWith;
	private LocalDateTime endedDate;
	
	public WarAuditDTO() {
		System.out.println("calling no arg constr.of WarAuditDTO..");
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public LocalDateTime getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDateTime startedDate) {
		this.startedDate = startedDate;
	}

	public String getStaredWith() {
		return staredWith;
	}

	public void setStaredWith(String staredWith) {
		this.staredWith = staredWith;
	}

	public LocalDateTime getEndedDate() {
		return endedDate;
	}

	public void setEndedDate(LocalDateTime endedDate) {
		this.endedDate = endedDate;
	}
	 

}
