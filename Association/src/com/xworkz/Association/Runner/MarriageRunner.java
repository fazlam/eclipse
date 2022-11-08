package com.xworkz.Association.Runner;

import com.xworkz.Association.inheritance.loveMarriage;

public class MarriageRunner {

	public static void main(String[] args) {
		
		loveMarriage loveMarriage =new loveMarriage("bangloru","arange","14/11/2022");
		System.out.println("marriage location :"+ loveMarriage.location);
		System.out.println("marriage type :"+ loveMarriage.type);
		System.out.println("marriage date :"+ loveMarriage.date);

	}

}
