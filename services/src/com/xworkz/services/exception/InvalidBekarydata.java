package com.xworkz.services.exception;

public class InvalidBekarydata extends Exception{
	public InvalidBekarydata() {
		System.out.println("Running the exception...");
	}
	public InvalidBekarydata(String Texts) {
		super(Texts);
	}
	
	

}
