package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HelemetAuditDTO implements Serializable {
	
	private  String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
  public HelemetAuditDTO() {
    System.out.println("calling no arg const...");
}

public HelemetAuditDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
	super();
	this.createdBy = createdBy;
	this.createdDate = createdDate;
	this.updatedBy = updatedBy;
	this.updatedDate = updatedDate;
}

@Override
public String toString() {
	return "HelemetAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
			+ ", updatedDate=" + updatedDate + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
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

public LocalDateTime getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(LocalDateTime updatedDate) {
	this.updatedDate = updatedDate;
}
}
