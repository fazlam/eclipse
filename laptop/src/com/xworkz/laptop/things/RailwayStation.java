package com.xworkz.laptop.things;

public class RailwayStation {
	public String name;
	public String place;
	public String trainName;
	public String ticketType;
	public int trainnumber;
	public int[] numberOfStore;
	public int[] numberOfemployer;
	public String[] employNames;
	public int[] numberOfPlatfrom;
	public int[] TrainComes;
	public int[] peopleComes;
	
	public RailwayStation(String name,String place,String trainName,String ticketType,int trainnumber,int[] numberOfStore,int[] numberOfemployer,String[]employNames,int[]numberOfPlatfrom,int[]TrainComes,int[]peopleComes)
	{
		this.name=name;
		this.place=place;
		this.trainName=trainName;
		this.ticketType=ticketType;
		this.trainnumber=trainnumber;
		this.numberOfemployer=numberOfemployer;
		this.employNames=employNames;
		this.numberOfPlatfrom=numberOfPlatfrom;
		this.TrainComes=TrainComes;
		this.peopleComes=peopleComes;
		this.numberOfStore=numberOfStore;
	}
	public void information()
	{
	 System.out.println(this.name);
	 System.out.println(this.place);	
	 System.out.println(this.trainName);	
	 System.out.println(this.ticketType);	
	 System.out.println(this.trainnumber);
	 
	 for (int i = 0; i < numberOfStore.length; i++) {
		int j = numberOfStore[i];
		System.out.println(j);
		
	}
	 for (int j = 0; j < numberOfemployer.length; j++) {
		int ref = numberOfemployer[j];
		System.out.println(ref);
		
	}
	 for (int k = 0; k < employNames.length; k++) {
		String ref = employNames[k];
		System.out.println(ref);
		
	}
	 for (int m = 0; m < numberOfPlatfrom.length; m++) {
		int ref = numberOfPlatfrom[m];
		System.out.println(ref);
		
	}
	 for (int n = 0; n < TrainComes.length; n++) {
		int ref = TrainComes[n];
		System.out.println(ref);
		
	}
	 for (int p = 0; p < peopleComes.length; p++) {
		int ref = peopleComes[p];
		System.out.println(ref);
		
	}
	}

}
