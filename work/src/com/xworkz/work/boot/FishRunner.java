package com.xworkz.work.boot;

import com.xworkz.work.Fish;

public class FishRunner {

	public static void main(String[] args) {
		
		//1.Name and Type
		Fish Fish=new Fish("Popcorn","Bony Fish");
		System.out.println(Fish);
		
		System.out.println(Fish.Name);  // Popcorn
		System.out.println(Fish.Type);  //  Bpny Fish
		System.out.println(Fish.Price); //  0
		System.out.println(Fish.Weight);//  0.0
		System.out.println(Fish.Lenght); // null
		
      //2. Name and Price
		
		Fish price=new Fish("Popcorn",100);
		System.out.println(price);
		
		System.out.println(price.Name);  // Popcorn
		System.out.println(price.Type);  //  null
		System.out.println(price.Price); //  100
		System.out.println(price.Weight);//  0.0
		System.out.println(price.Lenght); // null
		
		//3.Price and weight
		
		Fish Weight=new Fish(100,500);
		System.out.println(Weight);
		
		System.out.println(Weight.Name);  // null
		System.out.println(Weight.Type);  //  500.0
		System.out.println(Weight.Price); //  100
		System.out.println(Weight.Weight);//  0.0
		System.out.println(Weight.Lenght); // null
		
		//4.Weight and Lenght
		
		Fish Lenght=new Fish(500,100);
		System.out.println(Lenght);
		
		System.out.println(Lenght.Name);  // null
		System.out.println(Lenght.Type);  //  null
		System.out.println(Lenght.Price); //  0
		System.out.println(Lenght.Weight);//  500.0
		System.out.println(Lenght.Lenght); // 100cm
		
		
	
		
	}

}
