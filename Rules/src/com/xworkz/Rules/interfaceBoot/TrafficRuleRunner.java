package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.TrafficRule;
import com.xworkz.Rules.interfaceSubClass.Citizen;

public class TrafficRuleRunner {

	public static void main(String[] args) {
	
		Citizen citizen =new Citizen();
		citizen.followSignals();
		citizen.speedLimits(50);
		citizen.trippleRiding();
		citizen.wereHalment();
		citizen.wereSeatBelt();
		
		System.out.println("==========================================");
		
		TrafficRule trafficRule=new Citizen();
		trafficRule.followSignals();
		trafficRule.speedLimits(60);
		trafficRule.trippleRiding();
		trafficRule.wereSeatBelt();
		trafficRule.wereHalment();
		
		System.out.println("==========================================");
		
		
	
		
			
		

	}

}
