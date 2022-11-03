package com.xworkz.Association.thinks;

import com.xworkz.Association.enums.PillarShap;

public class Pillar {
	public int id;
	public String place;
	public PillarShap shape=PillarShap.RECTANGULAR;
	public double height;
	public String supported;
	public Company company=new Company("fazlam","contarctore base") ;
	
	public Pillar() {
		
	}
	public Pillar(int id,String place,double height,String supported) {
		this.id=id;
		this.place=place;
		this.height=height;
		this.supported=supported;
	}
		
	public void showOff()
	{
		
		System.out.println("pillar id is:"+ this.id);
		System.out.println("place is:"+ this.place);
		System.out.println("pillar height is:"+ this.height);
		System.out.println("pillar is supported to :"+ this.supported);
		System.out.println("pillar shape is :" + PillarShap.RECTANGULAR);
		
		
	}
	
	
}
