package com.xworkz.ipl.dto;

public class WarDTO extends WarAuditDTO{
	private String warName;
	private String staredBy;
	private String staredWith;
	private String wonBy;
	private double noOfDeaths;
	
	public WarDTO() {
		System.out.println("calling the no arg const of .warDTO...");
	}

	@Override
	public String toString() {
		return "WarDTO [warName=" + warName + ", staredBy=" + staredBy + ", staredWith=" + staredWith + ", wonBy="
				+ wonBy + ", noOfDeaths=" + noOfDeaths + "]";
	}

	public String getWarName() {
		return warName;
	}

	public void setWarName(String warName) {
		this.warName = warName;
	}

	public String getStaredBy() {
		return staredBy;
	}

	public void setStaredBy(String staredBy) {
		this.staredBy = staredBy;
	}

	public String getStaredWith() {
		return staredWith;
	}

	public void setStaredWith(String staredWith) {
		this.staredWith = staredWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public double getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

}
