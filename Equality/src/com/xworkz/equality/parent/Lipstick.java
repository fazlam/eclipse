package com.xworkz.equality.parent;

public class Lipstick {
	private String name;
	private String color;
	private String brand;
	private String shade;
	private double price;
	private int type;
	private double weight;
	private String chamical;
	private String company;
	private String founder;

	public Lipstick(String name, String color, String brand, String shade, double price, int type, double weight,
			String chamical, String company, String founder) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.shade = shade;
		this.price = price;
		this.type = type;
		this.weight = weight;
		this.chamical = chamical;
		this.company = company;
		this.founder = founder;
	}

	@Override
	public String toString() {
		return "Lipstick [name=" + name + ", color=" + color + ", brand=" + brand + ", shade=" + shade + ", price="
				+ price + ", type=" + type + ", weight=" + weight + ", chamical=" + chamical + ", company=" + company
				+ ", founder=" + founder + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getShade() {
		return shade;
	}

	public void setShade(String shade) {
		this.shade = shade;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getChamical() {
		return chamical;
	}

	public void setChamical(String chamical) {
		this.chamical = chamical;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public boolean equals(Object other) {
		System.out.println("running the equals method in Lipstick..");
		if (other instanceof Lipstick) {
			System.out.println("other is Lipstick chuck the propeties");
			Lipstick casted = (Lipstick) other;
			if (this.name.equals(casted.name) && this.color.equals(casted.color) && this.brand.equals(casted.brand)
					&& this.shade.equals(casted.shade) && this.price == casted.price && this.type == casted.type) {
				System.out.println("name is same");
				System.out.println("color is same");
				System.out.println("brand is same");
				System.out.println("shade is same");
				System.out.println("price is same");
				System.out.println("type is same");
				return true;
			}
		} else {
			System.err.println("other is not Lipstick,cennot check the propeties");
		}

		return false;

	}

}
