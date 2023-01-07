package com.xworkz.services.exception;

public class BekaryLimitAexcced extends RuntimeException {
	
	public BekaryLimitAexcced() {
		System.out.println("Bekary Size limit..is over..");
	}
	
	
    public BekaryLimitAexcced(String msg) {
    	super(msg);
    	
    }
}
