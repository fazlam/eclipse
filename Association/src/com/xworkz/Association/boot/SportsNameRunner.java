package com.xworkz.Association.boot;

import com.xworkz.Association.thinks.Sports;
import com.xworkz.Association.thinks.SportsName;

public class SportsNameRunner {

	public static void main(String[] args) {
	
	Sports sports = new Sports("cricket","virat","India",11,"t20wouldcup",10,5, 1,"melbone",200,"rohit");
	SportsName sportsName = new SportsName();
	sports.getname();
	sportsName.useSports(sports);
	

	}

}
