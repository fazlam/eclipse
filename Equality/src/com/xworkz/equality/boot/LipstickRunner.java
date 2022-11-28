package com.xworkz.equality.boot;

import com.xworkz.equality.parent.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		Lipstick lipstick = new Lipstick("lipstick","pink","mac","light pink",450,36,100,"butylited hydr","lakmai","hindustani uniliver");
		Lipstick lipstick2 = new Lipstick("lipstick","pink","mac","light pink",450,36,100,"butylited hydr","lakmai","hindustani uniliver");

		System.out.println(lipstick);
		System.out.println(lipstick2);
		
		boolean same =lipstick.equals(lipstick);
		System.out.println(same);
	}

}
