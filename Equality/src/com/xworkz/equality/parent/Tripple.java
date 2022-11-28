package com.xworkz.equality.parent;

public class Tripple {

	public static void main(String[] args) {
		String tripleRide = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";

		String[] SplitStament = tripleRide.split(",");
		for (int i = 0; i < SplitStament.length; i++) {
			System.out.println(SplitStament[i]);
		}
		System.out.println("===========================");
		String[] SplitStament1 = tripleRide.split(" ");
		for (int m = 0; m < SplitStament1.length; m++) {
			System.out.println(SplitStament1[m]);
		}
		System.out.println("===========================");
		String Upper = tripleRide.toUpperCase();
		System.out.println(Upper);

		System.out.println("===========================");
		String lower = tripleRide.toLowerCase();
		System.out.println(lower);

		System.out.println("===========================");
		char[] array = tripleRide.toCharArray();
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		System.out.println("===========================");
		
		
		System.out.println("===========================");

		char[] duplicat = lower.toCharArray();
		for (int k = 0; k < duplicat.length; k++) {
			for (int l = k + 1; l < duplicat.length; l++) {
				if (duplicat[k] == duplicat[l]) {
					duplicat[l] = 0;
				}
			}
			if (duplicat[k] != ' ' && duplicat[k] != 0) {
				System.out.println(duplicat[k]);
			}
		}
		System.out.println("===========================");

		char[] frequncy = lower.toCharArray();
		int[] freq = new int[frequncy.length];
		for (int k = 0; k < frequncy.length; k++) {
			freq[k] = 1;
			for (int l = k + 1; l < frequncy.length; l++) {
				if (frequncy[k] == frequncy[l]) {
					freq[k]++;
					frequncy[l] = 0;
				}
			}
		}
		for (int k = 0; k < freq.length; k++) {
			if (frequncy[k] != ' ' && frequncy[k] != 0 && frequncy[k] == 'r') {
				System.out.println(frequncy[k] + "-" + freq[k]);
			}
		}
		System.out.println("===========================");
		String rev=null;
		int len=tripleRide.length();
		System.out.println(len);
	    for (int i =len-1; i>=0; i--) {
			rev=rev+tripleRide.charAt(i);
		} 
	    System.out.println("reversed string is :"+ rev);
	    
	    if(tripleRide.equals(rev))
	    {
	    	System.out.println("it is palindrome String :"+ tripleRide);
	    }
	    else
	    {
	    	System.out.println("it is not palindrome String :"+ tripleRide);
	    }
	    
	    System.out.println("===========================");
	    
	    String[] palindrome = tripleRide.split(" ");
		for (int i = 0; i < palindrome.length; i++) {
			String[] palindrome1 = palindrome[i].split(",");
			for (int j = 0; j < palindrome1.length; j++) {
				System.out.println(palindrome1[j]);
				 if(palindrome[i]==palindrome1[j]) {
				StringBuilder str1 = new StringBuilder(palindrome1[j]);
				str1.reverse();
				String reve = str1.toString();
				if (str1.equals(rev)) {
					System.out.println(reve + ":: is a palindrom");
				} else {
					System.out.println(reve + ":: is not a palindrom");
				}
			}
		}
		System.out.println(palindrome.length);
	    	 
	     
	    
	}
	
	}
}
