package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class PizzaAuditDTO implements Serializable{
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime upadatedDate;
	
	public PizzaAuditDTO() {
		System.out.println("calling no arg const....");
	}

	public PizzaAuditDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime upadatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.upadatedDate = upadatedDate;
	}

	@Override
	public String toString() {
		return "PizzaAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", upadatedDate=" + upadatedDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpadatedDate() {
		return upadatedDate;
	}

	public void setUpadatedDate(LocalDateTime upadatedDate) {
		this.upadatedDate = upadatedDate;
	}

	

}
