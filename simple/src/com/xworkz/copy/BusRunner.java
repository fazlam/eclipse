package com.xworkz.copy;

public class BusRunner {

	public static void main(String[] args) {
		Bus no=new Bus();
		System.out.println(no.Number);
		
		Bus dest=new Bus();
		System.out.println(dest.destination);
		
		Bus sorc=new Bus();
		System.out.println(sorc.source);
		
		no.Number=80;
		dest.destination="majestic";
		sorc.source="RamMandir";		
		
		
		System.out.println(no.Number);
		System.out.println(dest.destination);
		System.out.println(sorc.source);
		

	}

}
