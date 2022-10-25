package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		Saloon saloon=new Saloon("male", "Banglore");
		saloon.showSaloon();
		saloon.noOfWorker=10;
		

	}

}
