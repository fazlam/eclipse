package com.xworkz.collation.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable{
	private String name;
	private String location;
	private String builtdBy;
	private boolean destroyed;
	private double visitingFees;
	
	public PalaceDTO() {
		System.out.println("no arg const of PalaceDTO....");
	}

	public PalaceDTO(String name, String location, String builtdBy, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtdBy = builtdBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Running the Hash code .....");
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof PalaceDTO) {
				PalaceDTO dto=(PalaceDTO)obj;
				if(dto.name.equals(this.name) && dto.location.equals(this.location)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtdBy=" + builtdBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltdBy() {
		return builtdBy;
	}

	public void setBuiltdBy(String builtdBy) {
		this.builtdBy = builtdBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
