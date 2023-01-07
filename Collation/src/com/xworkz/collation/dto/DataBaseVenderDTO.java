package com.xworkz.collation.dto;

import java.io.Serializable;

import com.xworkz.collation.constant.Type;

public class DataBaseVenderDTO implements Serializable {
	private String name;
	private String developedBy;
	private double licensCost;
	private double size;
	private Type type;
	
	public DataBaseVenderDTO() {
		System.out.println("no arg const of Data base venders...");
	}

	public DataBaseVenderDTO(String name, String developedBy, double licensCost, double size, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.licensCost = licensCost;
		this.size = size;
		this.type = type;
	}
	@Override
	public int hashCode() {
		System.out.println("Running the hash code....");
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof DataBaseVenderDTO) {
				DataBaseVenderDTO dto=(DataBaseVenderDTO)obj;
				if(dto.getDevelopedBy().equals(this.developedBy)) {
					return true;
				}
					
				
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DataBaseVenderDTO [name=" + name + ", developedBy=" + developedBy + ", licensCost=" + licensCost
				+ ", size=" + size + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getLicensCost() {
		return licensCost;
	}

	public void setLicensCost(double licensCost) {
		this.licensCost = licensCost;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Object toUpperCase() {
		
		return"Oracle DataBase";
	}

}
