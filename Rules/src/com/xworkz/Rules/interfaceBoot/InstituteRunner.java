package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.Institute;
import com.xworkz.Rules.interfaceSubClass.Xworkz;

public class InstituteRunner {

	public static void main(String[] args) {
		Xworkz ref1=new Xworkz();
		ref1.followSignals();
		ref1.interview();
		ref1.placement();
		ref1.speedLimits(50);
		ref1.training();
		ref1.trippleRiding();
		ref1.wereHalment();
		
		System.out.println("=======================================");
		
		Institute ref2=new Xworkz();
		ref2.placement();
		ref2.training();
		
		System.out.println("=======================================");
		
		
		

	}

}
