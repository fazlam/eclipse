package com.xworkz.think.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int [] value= {45,333,76,29,900,23,474,654,29,454};
		int tp=0;
		for (int i = 0; i < value.length-1; i++) {
			for(int j=i+1;j<value.length-1;j++) {
				if(value[i]<value[j]) {
					tp=value[i];
					value[i]=value[j];
					value[j]=tp;
				}
			}
		}
		for(int k=0;k<value.length;k++) {
			
			if(k==0)
				{
				System.out.println("max value is :"+value[k]);
				
			}
			if(k==8) {
				System.out.println("min value is : "+value[k]);
			}
		}
		System.out.println("===================");
		
		int []flower= {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < flower.length; i++) {
			if(flower[i]%2==0) {
				System.out.println("love is true");
			}else {
				System.out.println("love is not true");
			}
			
		}

	}
	

}
