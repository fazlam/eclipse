package com.xworkz.Association.boot;

import com.xworkz.Association.thinks.ParkInfo;
import com.xworkz.Association.thinks.park;

public class parkRunner {

	public static void main(String[] args) {
		
		park pet=new park();
		ParkInfo info=new ParkInfo();
         System.out.println(pet.getName());
         info.show();
	}

}
