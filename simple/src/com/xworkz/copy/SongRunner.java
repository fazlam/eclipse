package com.xworkz.copy;

public class SongRunner {

	public static void main(String[] args) {
		Song name=new Song();
		System.out.println(name.Name);
		
		Song lang=new Song();
		System.out.println(lang.Lang);
		
		Song sing=new Song();
		System.out.println(sing.Singer);
		
		Song lyr=new Song();
		System.out.println(lyr.Lyricst);
		
		Song tp=new Song();
		System.out.println(tp.Type);
		
		
		name.Name="Tum Hi Ho";
		lang.Lang="Hindi";
		sing.Singer="Arijit Sing";
		lyr.Lyricst="T-Series";
		tp.Type="Romantic";
		
		
		System.out.println(name.Name);
		System.out.println(lang.Lang);
		System.out.println(sing.Singer);
		System.out.println(lyr.Lyricst);
		System.out.println(tp.Type);

	}

}
