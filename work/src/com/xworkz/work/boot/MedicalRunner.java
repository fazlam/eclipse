package com.xworkz.work.boot;

import com.xworkz.work.Medical;

public class MedicalRunner {

	public static void main(String[] args) {
		
		int[] item= {2,4};
		String[] names= {"raju","babu"};
		String[] rooms= {"store room","main room"};
		String[] brand= {"dolo","parsita"};
		String[] face= {"fariam","dove"};
		String[] test= {"much","fivestare"};
		
		
		 
		Medical medical = new Medical("uday","bengalur", 6, "xyz", 876467847l, item, names, item, names, face, test);
		
		medical.display();
	}

}
