package com.xworkz.equality.parent;

public class WaterBottel {
	private String name;
	private String brand;
	private String material;
	private int capacity;
	private String color;
	private double weight;
	private String type;
	private double price;
	private boolean leakProof;
	private String company;
	
	public WaterBottel(String name, String brand, String material, int capacity, String color, double weight,
			String type, double price, boolean leakProof, String company) {
		super();
		this.name = name;
		this.brand = brand;
		this.material = material;
		this.capacity = capacity;
		this.color = color;
		this.weight = weight;
		this.type = type;
		this.price = price;
		this.leakProof = leakProof;
		this.company = company;
		
		
		
	}

	@Override
	public String toString() {
		return "WaterBottel [name=" + name + ", brand=" + brand + ", material=" + material + ", capacity=" + capacity
				+ ", color=" + color + ", weight=" + weight + ", type=" + type + ", price=" + price + ", leakProof="
				+ leakProof + ", company=" + company + "]";
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isLeakProof() {
		return leakProof;
	}

	public void setLeakProof(boolean leakProof) {
		this.leakProof = leakProof;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public boolean equals(Object other) {
		System.out.println("running the equals method in WaterBottel..");
		if(other instanceof WaterBottel) {
			System.out.println("other is WaterBottel chuck the propeties");
			WaterBottel casted = (WaterBottel)other;
			if(this.name.equals(casted.name )
			 && this.brand.equals(casted.brand)&& this.material.equals(casted.material))
			{
				System.out.println("name is same");
				System.out.println("brand is same");
				System.out.println("material is same");
				return true;
			}
		}else {
			System.err.println("other is not WaterBottel,cennot check the propeties");
		}
		
		return false;
		
	}

	

}
