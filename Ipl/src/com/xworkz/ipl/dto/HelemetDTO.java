package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.Color;

public class HelemetDTO extends HelemetAuditDTO {

	private String brand;
	private String type;
	private Color color;
	private Double price;

	public HelemetDTO() {
		System.out.println("calling the no arg const of HelemtDTO....");
	}

	public HelemetDTO(String brand, String type, Color color, Double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "HelemetDTO [brand=" + brand + ", type=" + type + ", color=" + color + ", price=" + price
				+ ", getBrand()=" + getBrand() + ", getType()=" + getType() + ", getColor()=" + getColor()
				+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
