package com.xworkz.laptop.things;

public class Medical {
	public String shopName;
	public String type;
	public String location;
	public int shopNumber;
	public String ownerName;
	public String[] color;
	public String[] tabletName;
	public int[] numberOfWorkers;
	public String[] workersNames;
	public String[] chocolates;
	public int[]  dailyEarning;
	
	
	public Medical(String shopName,String type,String location,int shopNumber,String ownerName,String[]color,String[]tabletName,int[]numberOfWorkers,String[]workersNames,String[]chocolates,int[] dailyEarning)
	{
		this.shopName=shopName;
		this.type=type;
		this.location=location;
		this.shopNumber=shopNumber;
		this.ownerName=ownerName;
		this.color=color;
		this.tabletName=tabletName;
		this.numberOfWorkers=numberOfWorkers;
		this.workersNames=workersNames;
		this.chocolates=chocolates;
		this.dailyEarning=dailyEarning;
		
	}
	public void display()
	{
		System.out.println(this.shopName);
		System.out.println(this.type);
		System.out.println(this.location);
		System.out.println(this.shopNumber);
		System.out.println(this.ownerName);
		
		for (int i = 0; i < color.length; i++) {
			String ref = color[i];
			System.out.println(ref); 
			
		}
		for (int k = 0; k < tabletName.length; k++) {
			String ref = tabletName[k];
			System.out.println(ref);
			
			
		}
		for (int k = 0; k < numberOfWorkers.length; k++) {
			int ref = numberOfWorkers[k];
			System.out.println(ref);
			
		}
		for (int l = 0; l < workersNames.length; l++) {
			String ref = workersNames[l];
			System.out.println(ref);
			
		}
		for (int m = 0; m < chocolates.length; m++) {
			String ref = chocolates[m];
			System.out.println(ref);
		
			
		}
		for (int n = 0; n < dailyEarning.length; n++) {
			int ref = dailyEarning[n];
			System.out.println(ref);
			
		}
	}

}
