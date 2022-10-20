package com.xworkz.work;

public class Medical {
	public String name;
	public String location;
	public int shopNumber;
	public String ownerName;
	public long contactNumber;
	public int[] numberOfWorkers;
	public String[] workersName;
	public int[] nameOfRooms;
	public String[] tabletsNames;
	public String[] availableFaceWash;
	public String[] availableCocolate;
	
	
	public Medical(String name,String location,int shopNumber,String ownerName,long contactNumber,int[]numberOfWorkers,String[]workersNames,int[]nameOfRooms,String[]tabletsNames,String[]availableFaceWash,String[]availableCocolate)
	{
		this.name=name;
		this.location=location;
		this.shopNumber=shopNumber;
		this.ownerName=ownerName;
		this.contactNumber=contactNumber;
		this.numberOfWorkers=numberOfWorkers;
		this.workersName=workersNames;
		this.nameOfRooms=nameOfRooms;
		this.tabletsNames=tabletsNames;
		this.availableFaceWash=availableFaceWash;
		this.availableCocolate=availableCocolate;
		
		
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.shopNumber);
		System.out.println(this.ownerName);
		System.out.println(this.contactNumber);
		System.out.println("=================================");
		System.out.println("workers");
		System.out.println("=================================");
		for (int i = 0; i < numberOfWorkers.length; i++) {
			int string = numberOfWorkers[i];
			System.out.println(string);
			
		}
		System.out.println("=================================");
		System.out.println("workers");
		System.out.println("=================================");
		for (int i = 0; i < workersName.length; i++) {
			String string = workersName[i];
			System.out.println(string);
			
		}

		System.out.println("=================================");
		System.out.println("workers");
		System.out.println("=================================");
		for (int i = 0; i < nameOfRooms.length; i++) {
			int string = nameOfRooms[i];
			System.out.println(string);
			
		}

		System.out.println("=================================");
		System.out.println("workers");
		System.out.println("=================================");
		for (int i = 0; i < numberOfWorkers.length; i++) {
			int string = numberOfWorkers[i];
			System.out.println(string);
			
		}

		System.out.println("=================================");
		System.out.println("workers");
		System.out.println("=================================");
		for (int i = 0; i < tabletsNames.length; i++) {
			String string = tabletsNames[i];
			System.out.println(string);
			
		}
		System.out.println("=================================");
		System.out.println("workers");
		System.out.println("=================================");
		for (int i = 0; i < availableCocolate.length; i++) {
			String string = availableCocolate[i];
			System.out.println(string);
			
		}

	}
}


