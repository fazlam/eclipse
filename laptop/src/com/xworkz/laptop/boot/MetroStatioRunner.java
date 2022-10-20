package com.xworkz.laptop.boot;

import com.xworkz.laptop.things.MetroStation;

public class MetroStatioRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] item = { "Raju", "ram", "kiran" };
		MetroStation metro = new MetroStation("uday", "tarun", item);
		metro.display();

	}

}
