package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.Company;
import com.xworkz.Rules.interfaceSubClass.Workers;

public class CompanyRunner {

	public static void main(String[] args) {
		Company company=new Workers();
		company.equal();
		company.ethicsPolicy();
		company.ethicsPolicy();
		company.workerComplaint();
		company.workerSafty();
		
		System.out.println("=========================================");
		Workers workers =new Workers();
		workers.equal();
		workers.ethicsPolicy();
		workers.workerComplaint();
		workers.workerPolicy();
		workers.workerSafty();
		

	}

}
