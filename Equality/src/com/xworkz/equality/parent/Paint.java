package com.xworkz.equality.parent;

public class Paint {
	
	private String name;
	private String brand;
	private int quantity;
	private double price;
	private String color;
	private boolean quality;
	private String companyName;
	private String founderName;
	private String shopName;
	private String location;
	
	
	public Paint()
	{
		
	}
	
	
	public Paint(String name, String brand, int quantity, double price, String color, boolean quality,
			String companyName, String founderName, String shopName, String location) {
		super();
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		this.color = color;
		this.quality = quality;
		this.companyName = companyName;
		this.founderName = founderName;
		this.shopName = shopName;
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Paint [name=" + name + ", brand=" + brand + ", quantity=" + quantity + ", price=" + price + ", color="
				+ color + ", quality=" + quality + ", companyName=" + companyName + ", founderName=" + founderName
				+ ", shopName=" + shopName + ", location=" + location + "]";
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFounderName() {
		return founderName;
	}
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean equals(Object other) {
		System.out.println("running the equals method in paint..");
		if(other instanceof Paint) {
			System.out.println("other is paint chuck the propeties");
			Paint casted = (Paint)other;
			if(this.name.equals(casted.name)) {
				System.out.println("name is same");
				return true;
			}
		}else {
			System.err.println("other is not Paint,cennot check the propeties");
		}
		
		return false;
		
	}
	
	
	
	
	
	

}
