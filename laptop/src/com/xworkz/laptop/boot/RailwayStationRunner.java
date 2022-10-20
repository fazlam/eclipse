package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.RailwayStation;

public class RailwayStationRunner {

	public static void main(String[] args) {
		int[] store= {10};
		int[] employ= {100};
		String[] names = {"rudru","mahesh"};
		int[] platfrom = {15};
		int[] come ={20};
		int[] people= {500};
		
		RailwayStation railwayStation=new RailwayStation("name of the station "+ " Decone","bhalki","special express","online",5342, store, employ, names, platfrom, come, people);
		
		railwayStation.information();
		

	}

}
