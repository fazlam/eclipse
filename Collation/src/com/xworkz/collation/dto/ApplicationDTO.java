package com.xworkz.collation.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
	
	private String name;
	private double version;
	private boolean free;
	private boolean developedBy;
	private double price;
	
	 public ApplicationDTO() {
	  System.out.println("no arg const of ApplicationDto....");
	}

	public ApplicationDTO(String name, double version, boolean free, boolean developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Running the hash code....");
		return 20;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof ApplicationDTO) {
				ApplicationDTO dto=(ApplicationDTO)obj;
				if(dto.developedBy==equals(this.developedBy)&& dto.free==equals(this.free)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public boolean getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(boolean developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
