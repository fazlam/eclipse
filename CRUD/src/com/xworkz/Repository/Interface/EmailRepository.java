package com.xworkz.Repository.Interface;

public interface EmailRepository {
	boolean create(String email);
	
	default int total() {
		return 0;
	
	}
}
