package com.xworkz.Rules.interfaceBoot;

import com.xworkz.Rules.interfaceClass.BankingRules;
import com.xworkz.Rules.interfaceSubClass.Employes;

public class BankingRulesRunner {

	public static void main(String[] args) {
		BankingRules bankingRules =new Employes();
		bankingRules.branchName();
		bankingRules.capitalRequirment();
		bankingRules.corporate();
		bankingRules.employerSafty();
		bankingRules.creditRatting();
		
		System.out.println("=====================================================");
		Employes employes = new Employes();
		employes.branchName();
		employes.capitalRequirment();
		employes.corporate();
		employes.creditRatting();
		employes.employerSafty();
		

	}

}
