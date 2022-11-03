package com.xworkz.Association.thinks;

public class Sports {
	private String name="cricket";
	String plyerName;
	String teamName;
	int numberOfPlyer;
	String seriesName;
	int totalMatch;
	int totalWin;
	int totalLoss;
	String vanue;
	int totalRun;
	String manOfTheMatch;
	
	public String getname()
	{
		return this.name;
	}
	void setname(String name)
	{
		this.name=name;
	}
	public Sports(String name, String plyerName, String teamName, int numberOfPlyer, String seriesName, int totalMatch,
			int totalWin, int totalLoss, String vanue, int totalRun, String manOfTheMatch) {
		super();
		this.name = name;
		this.plyerName = plyerName;
		this.teamName = teamName;
		this.numberOfPlyer = numberOfPlyer;
		this.seriesName = seriesName;
		this.totalMatch = totalMatch;
		this.totalWin = totalWin;
		this.totalLoss = totalLoss;
		this.vanue = vanue;
		this.totalRun = totalRun;
		this.manOfTheMatch = manOfTheMatch;
	}
	public void showOff()
	{
		System.out.println(name);
		System.out.println(plyerName);
		System.out.println(teamName);
		System.out.println(numberOfPlyer);
		System.out.println(seriesName);
		System.out.println(totalMatch);
		System.out.println(totalWin);
		System.out.println(totalLoss);
		System.out.println(vanue);
		System.out.println(totalRun);
		System.out.println(manOfTheMatch);
	}

}
