package com.xworkz.copy;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer name=new Developer();
		System.out.println(name.Name);
		
		Developer education=new Developer();
		System.out.println(education.Education);
		
		Developer exp=new Developer();
		System.out.println(exp.Experience);
		
		Developer com=new Developer();
		System.out.println(com.Company);
		
		Developer lpa=new Developer();
		System.out.println(lpa.Salary);
		
		
		name.Name="Fazlam";
		education.Education="BE";
		exp.Experience="Freshers";
		com.Company="X-workz";
		lpa.Salary=25000;
		
		
		System.out.println(name.Name);
		System.out.println(education.Education);
		System.out.println(exp.Experience);
		System.out.println(com.Company);
		System.out.println(lpa.Salary);

	}

}
