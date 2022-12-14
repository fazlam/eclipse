package com.xworkz.Repository.Implements;

import com.xworkz.Repository.Exception.EmailSizeException;
import com.xworkz.Repository.Interface.EmailRepository;

public class EmailRepositoryImpl implements EmailRepository{
	
	private String[]emails=new String[10];
	private int emailIndex=0;

	@Override
	public boolean create(String email) {
		if(this.emailIndex>=this.emails.length) {
			System.out.println("size exception connects....");
			throw new EmailSizeException();
	
		}
		this.emails[emailIndex]=email;
		this.emailIndex++;
			
		
		return false;
	}
		
		@Override
		public int total() {
			System.out.println("Running the total method..");
			return this.emails.length;
	}

}
