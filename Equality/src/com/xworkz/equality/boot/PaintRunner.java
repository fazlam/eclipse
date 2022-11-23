package com.xworkz.equality.boot;

import com.xworkz.equality.parent.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint("peach","AkzoNobel",10,500,"red", false,"indigo","livilivgeston","araye","benglore");
		
		Paint paint1 =new Paint("peach","AkzoNobel",10,500,"red", false,"indigo","livilivgeston","araye","benglore");
		
		System.out.println(paint);
		System.out.println(paint1);
		
		boolean same =paint.equals(paint1);
		System.out.println(same);

	}
	
	
	
	
	
	
	

}
