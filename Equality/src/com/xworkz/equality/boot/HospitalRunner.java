package com.xworkz.equality.boot;

import com.xworkz.equality.parent.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("Swami houspital","bheem nagar","bhalki","rudresh","dentelist",50, 20,100,"rajeshry medical", false);
		Hospital hospital2 = new Hospital("Swami houspital","bheem nagar","bhalki","rudresh","dentelist",50, 20,100,"rajeshry medical", false);
   
		
		System.out.println(hospital);
		System.out.println(hospital2);
		
		boolean same =hospital.equals(hospital);
		System.out.println(same);
	}

}
