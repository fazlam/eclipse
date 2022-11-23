package com.xworkz.equality.boot;

import com.xworkz.equality.parent.WaterBottel;

public class WaterBottelRunner {

	public static void main(String[] args) {
		WaterBottel waterBottel =new WaterBottel("gujji","solimo","stainless steel",100,"blue",487,"hot",200, true,"bissilery");
		WaterBottel waterBottel2 =new WaterBottel("gujji","solimo","stainless steel",100,"blue",487,"hot",200, true,"bissilery");
		
		System.out.println(waterBottel);
		System.out.println(waterBottel2);
		
		boolean same =waterBottel.equals(waterBottel);
		System.out.println(same);

	}

}
