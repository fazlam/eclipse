package com.xworkz.Association.thinks;

public class ParkInfo {
	park pet=new park();
	public void show() {
		pet.setName("kidsPark");
		System.out.println(pet.getName());
		pet.setLocation("bhalki");
		System.out.println(pet.getLocation());
		pet.setManagerName("vivek");
		System.out.println(pet.getManagerName());
		pet.setNumberOfWorker(20);
		System.out.println(pet.getNumberOfWorker());
		pet.setNumberOfTree(50);
		System.out.println(pet.getNumberOfTree());
		pet.setNumberOfTable(40);
		System.out.println(pet.getNumberOfTable());
		pet.setType("over age");
		System.out.println(pet.getType());
		pet.setCapacity(200);
		System.out.println(pet.getCapacity());
		pet.setFees(50);
		System.out.println(pet.getFees());
		pet.setNumberOfGate(10);
		System.out.println(pet.getNumberOfGate());
		pet.setOpenTime(3);
		System.out.println(pet.getOpenTime());
		pet.setCloseTime(9);
		System.out.println(pet.getCloseTime());
	}
	
	

}
