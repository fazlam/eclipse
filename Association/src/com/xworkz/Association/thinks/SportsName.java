package com.xworkz.Association.thinks;

public class SportsName {
	String name="Hockey";
	
	public Sports sports;
	
	public void useSports(Sports sports)
	{
		System.out.println(sports.manOfTheMatch);
		System.out.println(sports.numberOfPlyer);
		System.out.println(sports.plyerName);
		System.out.println(sports.seriesName);
		System.out.println(sports.teamName);
		System.out.println(sports.totalMatch);
		System.out.println(sports.totalWin);
		System.out.println(sports.totalLoss);
		System.out.println(sports.vanue);
		System.out.println(sports.totalRun);
		System.out.println(sports.getname());
		sports.setname("football");
		System.out.println("after update :"+ sports.getname());
		
		
	}

}
