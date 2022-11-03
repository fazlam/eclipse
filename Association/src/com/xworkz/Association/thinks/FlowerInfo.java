package com.xworkz.Association.thinks;

public class FlowerInfo {
	Flower pet=new Flower();
	public void disply()
	{
	 pet.setName("chameli");
	 pet.setColor("white");
	 pet.setPrice(50);
	 pet.setQuantity(10);
	 pet.setPlantName("shubham plant");
	 pet.setShopName("naveen flower shop");
	 pet.setFresh(true);
	 pet.setQulity(false);
	 pet.setUserName("janaki");
	 pet.setShopNumber(5);
	 pet.setLocation("benglore");
	 
	 
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
	}

}
