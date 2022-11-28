package com.xworkz.Rules.interfaceSubClass;

import com.xworkz.Rules.interfaceClass.Company;

public class Workers implements Company {

	@Override
	public boolean equal() {
		System.out.println("Running the worker equal method......");
		return false;
	}

	@Override
	public boolean workerSafty() {
		System.out.println("Running the worker safty method......");
		return false;
	}

	@Override
	public boolean workerPolicy() {
		System.out.println("Running the worker policy method......");
		return false;
	}

	@Override
	public boolean workerComplaint() {
		System.out.println("Running the worker complanit method......");
		return false;
	}

	@Override
	public boolean ethicsPolicy() {
		System.out.println("Running the worker ethics policy method......");
		return false;
	}

}
