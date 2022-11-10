package com.xworkz.Association.boot;

import com.xworkz.Association.child.Home;
import com.xworkz.Association.parent.PayingGeast;

public class PayingGeastRunner {

	public static void main(String[] args) {
		
		
		PayingGeast payingGeast =new PayingGeast();
		payingGeast.checkIn();
		Home home=new Home();
		home.checkIn();
		payingGeast.checkOut();
			
		

	}

}
