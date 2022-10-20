package com.xworkz.laptop.boot;
import com.xworkz.laptop.things.Medical;

public class MedicalRunner1 {
	

		public static void main(String[] args) {
			String[] color = {"yellow","black","white","red"};
			String[] name = {"dolo","petamol","calpol"};
			int[] worker = {2,3,4};
			String[] names= {"vicky","rohain","raju"};
			String[] brand= {"munch","kachaMango"};
			int[] mony= {500,600,800,};
	  Medical medical=new Medical("basava medical","genral store","bhalki",5,"balte", color, name, worker, names, brand, mony);
			medical.display();
		}

	}


