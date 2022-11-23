package com.xworkz.equality.parent;

public class Institution {
	private String name;
	private String place;
	private String location;
	private String type;
	private double fees;
	private int noStudent;
	private String traineName;
	private int noOftraines;
	private int noOfClass;
	private String founderName;
	
	
	public Institution(String name, String place, String location, String type, double fees, int noStudent,
			String traineName, int noOftraines, int noOfClass, String founderName) {
		super();
		this.name = name;
		this.place = place;
		this.location = location;
		this.type = type;
		this.fees = fees;
		this.noStudent = noStudent;
		this.traineName = traineName;
		this.noOftraines = noOftraines;
		this.noOfClass = noOfClass;
		this.founderName = founderName;
	}


	@Override
	public String toString() {
		return "Institution [name=" + name + ", place=" + place + ", location=" + location + ", type=" + type
				+ ", fees=" + fees + ", noStudent=" + noStudent + ", traineName=" + traineName + ", noOftraines="
				+ noOftraines + ", noOfClass=" + noOfClass + ", founderName=" + founderName + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public int getNoStudent() {
		return noStudent;
	}


	public void setNoStudent(int noStudent) {
		this.noStudent = noStudent;
	}


	public String getTraineName() {
		return traineName;
	}


	public void setTraineName(String traineName) {
		this.traineName = traineName;
	}


	public int getNoOftraines() {
		return noOftraines;
	}


	public void setNoOftraines(int noOftraines) {
		this.noOftraines = noOftraines;
	}


	public int getNoOfClass() {
		return noOfClass;
	}


	public void setNoOfClass(int noOfClass) {
		this.noOfClass = noOfClass;
	}


	public String getFounderName() {
		return founderName;
	}


	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	
	public boolean equals(Object other) {
		System.out.println("running the equals method in WaterBottel..");
		if(other instanceof Institution) {
			System.out.println("other is WaterBottel chuck the propeties");
			Institution casted = (Institution)other;
			if(this.name.equals(casted.name )
			 && this.place.equals(casted.place)&& this.location.equals(casted.location)&&this.type.equals(casted.type))
			{
				System.out.println("name is same");
				System.out.println("place is same");
				System.out.println("location is same");
				System.out.println("type is same");
				return true;
			}
		}else {
			System.err.println("other is not WaterBottel,cennot check the propeties");
		}
		
		return false;
		
	}

}
