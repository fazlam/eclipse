package com.xworkz.exception.SubClass;

import com.xworkz.exception.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule{
	
	boolean training() {
		return false;
	}
	boolean executeProgram() {
		return false;
	}

	@Override
	String eat() {
	System.out.println("Running the eat method from the person class...");
		return null;
	}

	@Override
	boolean sleep() {
		System.out.println("Running the sleep method from the person class...");
		return false;
	}

	@Override
	public boolean uplodedTask() {
		System.out.println("Running the uploded task method from the xworkz interface...");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("Running thecompleted program method from the xworkz interface...");
		return false;
		
		
		 
	}
	
	

}
