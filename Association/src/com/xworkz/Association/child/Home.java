package com.xworkz.Association.child;

import com.xworkz.Association.parent.PayingGeast;

public class Home extends PayingGeast {
	@Override
	public void checkIn() {
		super.checkIn();
		System.out.println("comming to overriding.....");
		
		
	}

}
