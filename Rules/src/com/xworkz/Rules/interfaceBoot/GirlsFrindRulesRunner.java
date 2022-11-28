package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.GirlsFrindRules;
import com.xworkz.Rules.interfaceSubClass.BoyFriend;

public class GirlsFrindRulesRunner {

	public static void main(String[] args) {
		GirlsFrindRules girlsFrindRules = new BoyFriend();
		girlsFrindRules.beHonest();
		girlsFrindRules.dontShearSecreats();
		girlsFrindRules.morePriority();
		girlsFrindRules.neverCheat();
		girlsFrindRules.permission();
		
		System.out.println("====================================");
		BoyFriend boyFriend =new BoyFriend();
		boyFriend.beHonest();
		boyFriend.dontShearSecreats();
		boyFriend.morePriority();
		boyFriend.neverCheat();
		boyFriend.permission();
		

	}

}
