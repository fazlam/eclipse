package com.xworkz.Apitude.question;

public class Sample {
	public static void main(String[]args) {
		int count=0;
		int num=200;
		int temp=num;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		int exp=count;
		int base=5;
		int prod=1;
		while(exp!=0)
		{
			prod=prod*base;
			exp--;
		}
		System.out.println(prod*temp);
	}

}
