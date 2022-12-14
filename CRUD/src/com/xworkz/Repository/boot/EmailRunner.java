package com.xworkz.Repository.boot;

import com.xworkz.Repository.Implements.EmailRepositoryImpl;

public class EmailRunner {

	public static void main(String[] args) {
		EmailRepositoryImpl ref=new EmailRepositoryImpl();
		
		ref.create("fazlam.xworkz@gmail.com");
		ref.create("Rudresh.xworkz@gmail.com");
		ref.create("shubham.xworkz@gmail.com");
		ref.create("prshant.xworkz@gmail.com");
		ref.create("jagdish.xworkz@gmail.com");
		ref.create("veena.xworkz@gmail.com");
		ref.create("sahana.xworkz@gmail.com");
		ref.create("sawti.xworkz@gmail.com");
		ref.create("sandeep.xworkz@gmail.com");
		ref.create("ravi.xworkz@gmail.com");
		ref.create("kavi.xworkz@gmail.com");
		
		System.out.println(ref.total());

	}

}
