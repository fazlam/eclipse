package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.PgRules;
import com.xworkz.Rules.interfaceSubClass.Boys;

public class PgRulesRunner {

	public static void main(String[] args) {
		PgRules pgRules = new Boys();
		pgRules.advanced();
		pgRules.closeTime();
		pgRules.noFoodWest();
		pgRules.openTime();
		pgRules.rent();
		
		System.out.println("=========================================");
		
		Boys boys =new Boys();
		boys.advanced();
		boys.closeTime();
		boys.noFoodWest();
		boys.openTime();
		boys.rent();

	}

}
