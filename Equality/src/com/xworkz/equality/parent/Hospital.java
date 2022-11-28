package com.xworkz.equality.parent;

public class Hospital {
	private String name;
	private String place;
	private String location;
	private String doctoreName;
	private String spacilest;
	private int noOfBeds;
	private int nodoctores;
	private int noOfPaseint;
	private String medicalStroreName;
	private boolean icu;

	public Hospital(String name, String place, String location, String doctoreName, String spacilest, int noOfBeds,
			int nodoctores, int noOfPaseint, String medicalStroreName, boolean icu) {
		super();
		this.name = name;
		this.place = place;
		this.location = location;
		this.doctoreName = doctoreName;
		this.spacilest = spacilest;
		this.noOfBeds = noOfBeds;
		this.nodoctores = nodoctores;
		this.noOfPaseint = noOfPaseint;
		this.medicalStroreName = medicalStroreName;
		this.icu = icu;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", place=" + place + ", location=" + location + ", doctoreName=" + doctoreName
				+ ", spacilest=" + spacilest + ", noOfBeds=" + noOfBeds + ", nodoctores=" + nodoctores
				+ ", noOfPaseint=" + noOfPaseint + ", medicalStroreName=" + medicalStroreName + ", icu=" + icu + "]";
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

	public String getDoctoreName() {
		return doctoreName;
	}

	public void setDoctoreName(String doctoreName) {
		this.doctoreName = doctoreName;
	}

	public String getSpacilest() {
		return spacilest;
	}

	public void setSpacilest(String spacilest) {
		this.spacilest = spacilest;
	}

	public int getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public int getNodoctores() {
		return nodoctores;
	}

	public void setNodoctores(int nodoctores) {
		this.nodoctores = nodoctores;
	}

	public int getNoOfPaseint() {
		return noOfPaseint;
	}

	public void setNoOfPaseint(int noOfPaseint) {
		this.noOfPaseint = noOfPaseint;
	}

	public String getMedicalStroreName() {
		return medicalStroreName;
	}

	public void setMedicalStroreName(String medicalStroreName) {
		this.medicalStroreName = medicalStroreName;
	}

	public boolean isIcu() {
		return icu;
	}

	public void setIcu(boolean icu) {
		this.icu = icu;
	}

	public boolean equals(Object other) {
		System.out.println("running the equals method in Hospital..");
		if (other instanceof Hospital) {
			System.out.println("other is Hospital chuck the propeties");
			Hospital casted = (Hospital) other;
			if (this.name.equals(casted.name) && this.place.equals(casted.place)
					&& this.location.equals(casted.location) && this.doctoreName.equals(casted.doctoreName)
					&& this.spacilest.equals(casted.spacilest)) {
				System.out.println("name is same");
				System.out.println("place is same");
				System.out.println("location is same");
				System.out.println("type is same");
				System.out.println("spacilest is same");
				return true;
			}
		} else {
			System.err.println("other is not Hospital,cennot check the propeties");
		}

		return false;

	}

}
