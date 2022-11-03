package com.xworkz.Association.boot;

import com.xworkz.Association.thinks.Company;
import com.xworkz.Association.thinks.Pillar;

public class PillarRunner {

	public static void main(String[] args) {
		
		Pillar pillar=new Pillar(200,"benglore",7.21,"mettro");
		pillar.showOff();
		Company company=new Company("fazlam","contarctore base");
		company.showOff();
		
		

	}

}
