package com.xworkz.Association.boot;

import com.xworkz.Association.thinks.Flower;
import com.xworkz.Association.thinks.FlowerInfo;

public class FlowerInfoRunner {

	public static void main(String[] args) {
		Flower pet=new Flower();
		FlowerInfo intr=new FlowerInfo();
		
		 System.out.println(pet.getName());
		 System.out.println(pet.getColor());
		 System.out.println(pet.getPrice());
		 System.out.println(pet.getQuantity());
		 System.out.println(pet.getPlantName());
		 System.out.println(pet.getShopName());
		 System.out.println(pet.isFresh());
		 System.out.println(pet.isQulity());
		 System.out.println(pet.getUserName());
		 System.out.println(pet.getShopNumber());
		 System.out.println(pet.getLocation());
		 
		 intr.disply();

	}

}
