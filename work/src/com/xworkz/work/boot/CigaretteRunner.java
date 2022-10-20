package com.xworkz.work.boot;

import com.xworkz.work.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		
		Cigarette name=new Cigarette();
		System.out.println(name.Name);
		name.Name="gold flak";
		System.out.println(name.Name);
		
		
		Cigarette brand=new Cigarette();
		System.out.println(brand.Brand);
		brand.Brand="Royal King";
		System.out.println(brand.Brand);
		
		Cigarette Fd=new Cigarette();
		System.out.println(Fd.Founder);
		
		Cigarette Dt=new Cigarette();
		System.out.println(Dt.Year);
		
		
		Cigarette Ct=new Cigarette();
		System.out.println(Ct.Price);
		Ct.Price=50;
		System.out.println(Ct.Price);
		
		Cigarette country=new Cigarette();
		System.out.println(country.Origin);
		
		
		Cigarette pc=new Cigarette();
		System.out.println(pc.NoPices);
		pc.NoPices=10;
		System.out.println(pc.NoPices);
		
		
		Cigarette color=new Cigarette();
		System.out.println(color.PackColor);
		
		
		Cigarette len=new Cigarette();
		System.out.println(len.Lenght);
		len.Lenght=5;
		System.out.println(len.Lenght);
		
		Cigarette mfd=new Cigarette();
		System.out.println(mfd.MFD);
		
		
		Cigarette tp=new Cigarette();
		System.out.println(tp.Type);
		tp.Type="king";
		System.out.println(tp.Type);
		
		
		Cigarette tool=new Cigarette();
		System.out.println(tool.ToolFrorm);
		
		Cigarette cl=new Cigarette();
		System.out.println(cl.NoOfColors);
		cl.NoOfColors=10;
		System.out.println(cl.NoOfColors);
		
		
		Cigarette nt=new Cigarette();
		System.out.println(nt.Note);
		
		Cigarette ts=new Cigarette();
		System.out.println(ts.Taste);
		ts.Taste="bad";
		System.out.println(ts.Taste);
		
		
		Cigarette area=new Cigarette();
		System.out.println(area.CompanyLocated);
		area.CompanyLocated="kolakata";
		System.out.println(area.CompanyLocated);
		
		Cigarette c1=new Cigarette();
		System.out.println(c1.Cot1);
		
		
		Cigarette c2=new Cigarette();
		System.out.println(c2.Cot2);
		
		
		
		
		
		

	}

}
