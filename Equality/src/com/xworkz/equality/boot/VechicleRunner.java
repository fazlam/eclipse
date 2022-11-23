package com.xworkz.equality.boot;

import com.xworkz.equality.parent.Vechicle;

public class VechicleRunner {

	public static void main(String[] args) {
		Vechicle vechicle = new Vechicle("indica","maruti suziki",50000,"fourweller",60,"white",55,4,"om sir","benglore");
		
		Vechicle vechicle2 = new Vechicle("indica","maruti suziki",50000,"fourweller",60,"white",55,4,"om sir","benglore");
		
		System.out.println(vechicle);
		System.out.println(vechicle2);
		
		boolean same =vechicle.equals(vechicle2);
		System.out.println(same);

	}

}
