package com.xworkz.equality.parent;

public class Vechicle {

	private String name;
	private String brand;
	private double price;
	private String type;
	private int mailage;
	private String color;
	private int ccNo;
	private int noOfTayers;
	private String ownerName;
	private String location;
	
	public Vechicle(String name, String brand, double price, String type, int mailage, String color, int ccNo,
			int noOfTayers, String ownerName, String location) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.mailage = mailage;
		this.color = color;
		this.ccNo = ccNo;
		this.noOfTayers = noOfTayers;
		this.ownerName = ownerName;
		this.location = location;
		
		
		
	}

	@Override
	public String toString() {
		return "Vechicle [name=" + name + ", brand=" + brand + ", price=" + price + ", type=" + type + ", mailage="
				+ mailage + ", color=" + color + ", ccNo=" + ccNo + ", noOfTayers=" + noOfTayers + ", ownerName="
				+ ownerName + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMailage() {
		return mailage;
	}

	public void setMailage(int mailage) {
		this.mailage = mailage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCcNo() {
		return ccNo;
	}

	public void setCcNo(int ccNo) {
		this.ccNo = ccNo;
	}

	public int getNoOfTayers() {
		return noOfTayers;
	}

	public void setNoOfTayers(int noOfTayers) {
		this.noOfTayers = noOfTayers;
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
	public boolean equals(Object other) {
		System.out.println("running the equals method in Vechicle..");
		if(other instanceof Vechicle) {
			System.out.println("other is paint chuck the propeties");
			Vechicle casted = (Vechicle)other;
			if(this.name.equals(casted.name )
			 && this.brand.equals(casted.brand))
			{
				System.out.println("name is same");
				System.out.println("brand is same");
				return true;
			}
		}else {
			System.err.println("other is not Vechicle,cennot check the propeties");
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	

}
