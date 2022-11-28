package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.CricketRules;
import com.xworkz.Rules.interfaceSubClass.Players;

public class CricketRulesRunner {

	public static void main(String[] args) {
		CricketRules cricketRules =new Players();
		cricketRules.bowlDeliveries();
		cricketRules.humpirslimit();
		cricketRules.playerAgeLimit();
		cricketRules.playersSafty();
		cricketRules.playersLimit();
		
		System.out.println("=================================================");
		
		Players players =new Players();
		players.bowlDeliveries();
		players.humpirslimit();
		players.playerAgeLimit();
		players.playersSafty();
		players.playersLimit();

	}

}
