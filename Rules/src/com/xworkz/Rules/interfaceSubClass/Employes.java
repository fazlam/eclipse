package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.BankingRules;

public class Employes implements BankingRules {

	@Override
	public boolean capitalRequirment() {
		System.out.println("Running the capital requirment method.....");
		return false;
	}

	@Override
	public boolean corporate() {
		System.out.println("Running the corporatoer method.....");
		return false;
	}

	@Override
	public boolean creditRatting() {
		System.out.println("Running the credit ratting method.....");
		return false;
	}

	@Override
	public String branchName() {
		System.out.println("Running the branch name method.....");
		return null;
	}

	@Override
	public String employerSafty() {
		System.out.println("Running the Employer safty method.....");
		return null;
	}

}
