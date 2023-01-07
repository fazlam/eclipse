package com.xworkz.services.dto;

import com.xworkz.services.constant.FamousFor;

public class BekaryDTO extends AbstractAuditDTO {
	private String name;
	private String ownerName;
	private String location;
	private long contactNo;
	private FamousFor famousFor;

	public BekaryDTO() {
		System.out.println("calling the no arg const of BekaryDTO..");
	}

	public BekaryDTO(String name, String ownerName, String location, long contactNo, FamousFor famousFor) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.contactNo = contactNo;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "BekaryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", contactNo="
				+ contactNo + ", famousFor=" + famousFor + ", toString()=" + super.toString() + ", getCreatedBy()="
				+ getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedBy()=" + getUpdatedBy()
				+ ", getUpdatedDate()=" + getUpdatedDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public FamousFor getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(FamousFor famousFor) {
		this.famousFor = famousFor;
	}

}
