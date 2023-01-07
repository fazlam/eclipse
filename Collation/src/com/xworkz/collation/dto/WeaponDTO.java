package com.xworkz.collation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.collation.constant.TypeOfWeapon;

public class WeaponDTO implements Serializable {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private TypeOfWeapon type;
	
	public WeaponDTO() {
		System.out.println("Running No arg const.of WeaponDTO......");
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, double price, TypeOfWeapon type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	@Override
	public int hashCode() {
		System.out.println("Running the Hash code in WeaponDTO....");
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto=(WeaponDTO)obj;
				if(dto.name.equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TypeOfWeapon getType() {
		return type;
	}

	public void setType(TypeOfWeapon type) {
		this.type = type;
	}
	

}
