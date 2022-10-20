package com.xworkz.work.boot;

import com.xworkz.work.Sambar;

public class SambarRunner {

	public static void main(String[] args) {
		
		String[] color={"red","yellow"};
		String[] itom={"salt","chillipowder"};
		String[] eat= {"fazlam","ravi"};
		String[] make= {"raj","ajay"};
		String[] store= {"bucket","cantainer"};
		
		Sambar sambar=new Sambar("TaTa","chicken",50,5,true,color,itom,eat,make,store);
		sambar.Display();
			
		
				
	
	}
}
	


