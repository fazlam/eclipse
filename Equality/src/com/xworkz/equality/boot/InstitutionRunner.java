package com.xworkz.equality.boot;

import com.xworkz.equality.parent.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institution=new Institution("Xworkz","Rajajinagar","benglore","java leruning",30000,500,"vinoda mam",10,5,"omkar sir");
		Institution institution2=new Institution("Xworkz","Rajajinagar","benglore","java leruning",30000,500,"vinoda mam",10,5,"omkar sir");
		
		System.out.println(institution);
		System.out.println(institution2);
		
		boolean same =institution.equals(institution);
		System.out.println(same);

	}

}
