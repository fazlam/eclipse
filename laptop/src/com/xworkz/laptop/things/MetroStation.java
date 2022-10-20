package com.xworkz.laptop.things;

public class MetroStation {
	public String name;
	public String location;
	public String[] employName;
	

	public MetroStation(String name, String location, String[] employName) {
		this.name = name;
		this.location = location;
		this.employName = employName;

	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println("employ name");
		for (int i = 0; i < employName.length; i++) {
			String ref = employName[i];
			System.out.println(ref);

		}
		

		{
			
		}
	}

}
