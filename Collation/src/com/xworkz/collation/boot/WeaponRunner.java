package com.xworkz.collation.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collation.constant.TypeOfWeapon;
import com.xworkz.collation.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		Collection<WeaponDTO> weapon=new LinkedList<WeaponDTO>();
		weapon.add(new WeaponDTO("Short Gun","India",LocalDate.of(1988, 05, 23),1000,TypeOfWeapon.BOW_ARROW));
		weapon.add(new WeaponDTO("Rifles","India",LocalDate.of(1998, 04, 20),1000,TypeOfWeapon.CANNON));
		weapon.add(new WeaponDTO("Shootter Gun","USA",LocalDate.of(1978, 03, 22),2000,TypeOfWeapon.PISTOL));
		weapon.add(new WeaponDTO("Firing Gun","India",LocalDate.of(1949, 02, 11),100,TypeOfWeapon.REVOLVER));
		weapon.add(new WeaponDTO("Shifiles shoter","SoctLand",LocalDate.of(1999, 01, 30),2000,TypeOfWeapon.RIFLE));
		weapon.add(new WeaponDTO("MG3","Pakistan",LocalDate.of(2000, 05, 21),1000,TypeOfWeapon.BOW_ARROW));
		weapon.add(new WeaponDTO("Swords","India",LocalDate.of(1999, 07, 31),30000,TypeOfWeapon.REVOLVER));
		weapon.add(new WeaponDTO("Spera","USA",LocalDate.of(1977, 06, 14),10000,TypeOfWeapon.BOW_ARROW));
		weapon.add(new WeaponDTO("pistal","Japan",LocalDate.of(1998, 01, 19),10000,TypeOfWeapon.CANNON));
		weapon.add(new WeaponDTO("Filream","Af",LocalDate.of(2022, 02, 23),10000,TypeOfWeapon.SPEAR));
		weapon.add(new WeaponDTO("HandGume","India",LocalDate.of(1999, 01, 12),2000,TypeOfWeapon.SHOTGUN));
		weapon.add(new WeaponDTO("Dagger","India",LocalDate.of(1978, 03, 16),20000,TypeOfWeapon.SWORDS));
		weapon.add(new WeaponDTO("Revlver","USA",LocalDate.of(2002, 04, 22),10000,TypeOfWeapon.REVOLVER));
		weapon.add(new WeaponDTO("Aritller","Pakistan",LocalDate.of(2001, 03, 22),10000,TypeOfWeapon.BOW_ARROW));
		weapon.add(new WeaponDTO("Axe","India",LocalDate.of(2003, 04, 19),3000,TypeOfWeapon.BOW_ARROW));
		weapon.add(new WeaponDTO("Mace","Rashiya",LocalDate.of(1988, 07, 13),10000,TypeOfWeapon.RIFLE));
		weapon.add(new WeaponDTO("Crossbow","India",LocalDate.of(2012, 06, 23),30000,TypeOfWeapon.SWORDS));
		weapon.add(new WeaponDTO("Musket","Pakistan",LocalDate.of(2015, 04, 11),10000,TypeOfWeapon.SWORDS));
		
		System.out.println("price >6000 and their name");
		weapon.stream().filter((greater)->greater.getPrice()>6000).collect(Collectors.toList())
		.forEach(greater ->System.out.println(greater.getName()));
		
		System.out.println("print all made by and made on");
		weapon.stream()
		.forEach(e->System.out.println("weapon made by :"+e.getMadeBy() + "and weapon made on:" +e.getMadeOn()));
		
		System.out.println("print all weapon by desc order");
		weapon.stream()
		.sorted((name1 ,name2) -> name2.getName().compareTo(name1.getName())).forEach(e ->System.out.println(e.getName()));
		
		System.out.println("print all weapon  sort by madeby asce order");
		weapon.stream()
		.sorted((madeBy1,madeBy2) ->madeBy2.getMadeBy().compareTo(madeBy1.getMadeBy())).forEach(e ->System.out.println(e.getMadeBy()));
		
		System.out.println("print the all weapom made on by asce order");
		weapon.stream()
		.sorted((e1,e2) ->e1.getMadeOn().compareTo(e2.getMadeOn())).forEach(e ->System.out.println(e.getMadeOn()));
		
		System.out.println("print all weapon name and madeBy by asce order.");
		weapon.stream().sorted((e1,e2) ->e1.getName().compareTo(e2.getName()))
		.sorted((e1,e2) ->e1.getMadeBy().compareTo(e1.getMadeBy()))
		.forEach(e ->System.out.println("sorted type: "+e.getName() + "and sorted made By : "+e.getMadeBy()));
		
		System.out.println("print all weapon price by desce order");
		weapon.stream().sorted((e1,e2) ->Double.compare(e1.getPrice(),e2.getPrice())).forEach(e ->System.out.println(e.getPrice()));
		
		

		
	

	}

}
