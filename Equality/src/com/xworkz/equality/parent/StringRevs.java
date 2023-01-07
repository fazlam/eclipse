package com.xworkz.equality.parent;

public class StringRevs {

	public static String name= "fazlam";
	static char[]array=name.toCharArray();
	
	public static void main(String[] args) {
		System.out.println(array.length);
		for(int index=array.length-1;index>=0;index--)
		{
			char name1=array[index];
			System.err.print(name1);
		}
		
		
		

	}

}
