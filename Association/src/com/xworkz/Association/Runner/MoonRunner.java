package com.xworkz.Association.Runner;

import com.xworkz.Association.inheritance.Moon;
import com.xworkz.Association.inheritance.Satellite;

public class MoonRunner {

	public static void main(String[] args) {
		
		Moon moon=new Moon("white", true);
		moon.showMoon();
		
		
		Moon moon1=new Satellite("all", true, "rink jet");
		moon1.showMoon();


	}

}
