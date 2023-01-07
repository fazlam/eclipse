package com.xworkz.collation.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StateDams {

	public static void main(String[] args) {
		Collection<String> damsOfKarnataka = new ArrayList<String>(); // 1
		damsOfKarnataka.add("KrishnaRajaSagara Dam");
		damsOfKarnataka.add("Tungabhadra Dam");
		damsOfKarnataka.add("Basava Sagar Reservoir");
		damsOfKarnataka.add("Linganamakki dam");
		damsOfKarnataka.add("Almatti Dam");
		damsOfKarnataka.add("Hirakud Dam");
		damsOfKarnataka.add("Vani Vilasa Sagara");
		damsOfKarnataka.add("Khadakwasla Dam");
		damsOfKarnataka.add("Somasila Dam");
		damsOfKarnataka.add("Yeldari Dam");
		System.out.println("karnataka total dams : " + damsOfKarnataka.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfAndhraPradesh = new ArrayList<String>(); // 2
		damsOfAndhraPradesh.add("Jalaput Dam, Jalaput");
		damsOfAndhraPradesh.add("Srisailam Dam, Srisailam");
		damsOfAndhraPradesh.add("Nagarjuna Sagar Dam, Vijayapuri South");
		damsOfAndhraPradesh.add("Gandikota Reservoir, Gandikota village");
		damsOfAndhraPradesh.add("Velugodu Balancing Reservoir, Velgode");
		damsOfAndhraPradesh.add("Gollapalli Reservoir, Penukonda");
		damsOfAndhraPradesh.add("Jeedipalli Reservoir, Jeedipalli village");
		damsOfAndhraPradesh.add("Sunkesula Barrage, Kurnool");
		damsOfAndhraPradesh.add("Thotapalli Barrage, Thotapali village");
		damsOfAndhraPradesh.add("Gundlakamma Reservoir Project, Chinnamallavaram");
		System.out.println("total dams AP : " + damsOfAndhraPradesh.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfArunachalPradesh = new ArrayList<String>(); // 3
		damsOfArunachalPradesh.add("Ranganadi Dam");
		damsOfArunachalPradesh.add("Subansiri Lower HE (Nhpc) Dam");
		damsOfArunachalPradesh.add("Dibang Dam");
		damsOfArunachalPradesh.add("Upar slag Dam");
		System.out.println("total dams in Arunachal prdesh.. : " + damsOfArunachalPradesh.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfAssam = new ArrayList<String>(); // 4
		damsOfAssam.add("Pagladia");
		damsOfAssam.add("Khandong");
		damsOfAssam.add("Umrong");
		damsOfAssam.add("Subansiri Lower Dam");
		System.out.println("total dams in Assam : " + damsOfAssam.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfBihar = new ArrayList<String>(); // 5
		damsOfBihar.add("Ajan Dam");
		damsOfBihar.add("Amrity Dam");
		damsOfBihar.add("Badua Dam");
		damsOfBihar.add("Barnar Dam");
		damsOfBihar.add("Baskund Dam");
		damsOfBihar.add("Belharna Dam");
		damsOfBihar.add("Bilasi Dam");
		damsOfBihar.add("Chandan Dam");
		damsOfBihar.add("Durgawati Dam");
		damsOfBihar.add("Gaighat Dam");
		System.out.println("total dams in Bihar :" + damsOfBihar.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfChhattisgarh = new ArrayList<String>(); // 6
		damsOfChhattisgarh.add("Adpather Dam");
		damsOfChhattisgarh.add("Agariya Dam");
		damsOfChhattisgarh.add("Ajabnagar Dam");
		damsOfChhattisgarh.add("Amabeda Dam");
		damsOfChhattisgarh.add("Barat Sagar Dam");
		damsOfChhattisgarh.add("Barnai Dam");
		damsOfChhattisgarh.add("Barpara Dam");
		damsOfChhattisgarh.add("Darritola Dam");
		damsOfChhattisgarh.add("Dhanras Dam");
		damsOfChhattisgarh.add("Dhupkot Dam");
		System.out.println("total dams in Chhattisgarh :" + damsOfChhattisgarh.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfGoa = new ArrayList<String>(); // 7
		damsOfGoa.add("Anjunam Dam");
		damsOfGoa.add("M.I. Dam");
		damsOfGoa.add("Salaulim Dam");
		System.out.println("total dams in Goa :" + damsOfGoa.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfGujarat = new ArrayList<String>(); // 8
		damsOfGujarat.add("Aamli Chharchhoda Dam");
		damsOfGujarat.add("Abhalwad Dam");
		damsOfGujarat.add("Adhia Dam");
		damsOfGujarat.add("Baladhor Dam");
		damsOfGujarat.add("Bhaguda Dam");
		System.out.println("total dams in Gujrat :" + damsOfGujarat.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfHaryana = new ArrayList<String>(); // 9
		damsOfHaryana.add("Kaushalya Dam");
		damsOfHaryana.add("Ottu barrage dam");
		damsOfHaryana.add("Tajewala Barrage dam");
		damsOfHaryana.add("Hathnikund barrage Dam");
		damsOfHaryana.add("Anagpur  Dam");
		System.out.println("total dams in Haryana :" + damsOfHaryana.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfHimachalPradesh = new ArrayList<String>(); // 10
		damsOfHimachalPradesh.add("Baira Siul Dam");
		damsOfHimachalPradesh.add("	Bassi Dam");
		damsOfHimachalPradesh.add("Bhakra Dam");
		damsOfHimachalPradesh.add("Chamera I Dam");
		System.out.println("total dams i HP :" + damsOfHimachalPradesh.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfJharkhand = new ArrayList<String>(); // 11
		damsOfJharkhand.add("Anjanwa Dam");
		damsOfJharkhand.add("Anraj Dam");
		damsOfJharkhand.add("Baksa/Buksa Dam");
		damsOfJharkhand.add("Bandha/Baudha Dam");
		damsOfJharkhand.add("fazlam Dam");
		System.out.println("total dams in Jharkhand :" + damsOfJharkhand.size());
		System.out.println(System.lineSeparator());

		Collection<String> damsOfKerala = new ArrayList<String>(); // 12
		damsOfKerala.add("Erattayar (Eb) Dam");
		damsOfKerala.add("damalayar (Eb) Dam");
		damsOfKerala.add("Idukki (Eb)/Idukki Arch Dam");
		damsOfKerala.add("Kakkayam Dam");

		Collection<String> damsOfMadhyaPradesh = new ArrayList<String>(); // 13
		damsOfMadhyaPradesh.add("Zadi Dam");
		damsOfMadhyaPradesh.add("Yashwant Nagar Dam");
		damsOfMadhyaPradesh.add("Yashvant Sagar (Corporation) Dam");
		damsOfMadhyaPradesh.add("Wagya Dam");
		damsOfMadhyaPradesh.add("Vagadalwadi Dam");
		damsOfMadhyaPradesh.add("Upper Chraipani Dam");
		damsOfMadhyaPradesh.add("Upper Beda Dam");
		damsOfMadhyaPradesh.add("Sustikheda Dam");
		damsOfMadhyaPradesh.add("Surajpura Dam");
		damsOfMadhyaPradesh.add("Sukha Dam");

		Collection<String> damsOfMaharashtra = new ArrayList<String>(); // 14
		damsOfMaharashtra.add("Dhamapur");
		damsOfMaharashtra.add("Vihar");
		damsOfMaharashtra.add("Shirsufal");
		damsOfMaharashtra.add("Ekrukh");
		damsOfMaharashtra.add("Mhaswad");

		Collection<String> damsOfManipur = new ArrayList<String>(); // 15
		damsOfManipur.add("Khoupum Dam");
		damsOfManipur.add("Khuga Dam");
		damsOfManipur.add("	Singda Dam");
		damsOfManipur.add("Thoubal Dam");

		Collection<String> damsOfMeghalaya = new ArrayList<String>(); // 16
		damsOfMeghalaya.add("Khandong Dam");
		damsOfMeghalaya.add("Kyrdemkulai (Umiam st-III) Dam");
		damsOfMeghalaya.add("Mawphlang Dam");
		damsOfMeghalaya.add("Myntdu-Leshka Dam");

		Collection<String> damsOfMizoram = new ArrayList<String>(); // 17
		damsOfMizoram.add("Mizoram Dam");
		damsOfMizoram.add("Kolasib Dam");

		Collection<String> damsOfNagaland = new ArrayList<String>(); // 18
		damsOfNagaland.add("Doyang Hep Dam");

		Collection<String> damsOfOdisha = new ArrayList<String>(); // 19
		damsOfOdisha.add("Aradei Dam");
		damsOfOdisha.add("Arikul Dam");
		damsOfOdisha.add("Badanalla Dam");
		damsOfOdisha.add("Badabandha Dam");

		Collection<String> damsOfPunjab = new ArrayList<String>(); // 20
		damsOfPunjab.add("Chohal Dam");
		damsOfPunjab.add("Damsal Dam");
		damsOfPunjab.add("Dholbaha Dam");
		damsOfPunjab.add("Jainti Dam");

		Collection<String> damsOfRajasthan = new ArrayList<String>(); // 21
		damsOfRajasthan.add("vallabhnagar");
		damsOfRajasthan.add("Umed/ Umaid Sagar (Baran) Dam");
		damsOfRajasthan.add("Shivnath Sagar Dam");
		damsOfRajasthan.add("Silibari Dam");

		Collection<String> damsOfSikkim = new ArrayList<String>(); // 22
		damsOfSikkim.add("Rangit III ");
		damsOfSikkim.add("Rangpo ");
		damsOfSikkim.add("Rongli ");
		damsOfSikkim.add("Teesta -V (NHPC) ");
		damsOfSikkim.add("Teesta-III ");
		damsOfSikkim.add("Teesta-IV ");

		Collection<String> damsOfTamilNadu = new ArrayList<String>(); // 23
		damsOfTamilNadu.add("Nilayur Bed ");
		damsOfTamilNadu.add("Noyyal Athupalayam ");
		damsOfTamilNadu.add("Palar Porundalar ");
		damsOfTamilNadu.add("Shoolagiri Chinnar ");

		Collection<String> damsOfTelangana = new ArrayList<String>(); // 24
		damsOfTelangana.add("Singur Dam, Sangareddy");
		damsOfTelangana.add("Nizam Sagar, Kamareddy");
		damsOfTelangana.add("Sriram Sagar Project");
		damsOfTelangana.add("Sadarmat Barrage");
		damsOfTelangana.add("Yellampalli, Karimnagar");

		Collection<String> damsOfTripura = new ArrayList<String>(); // 25
		damsOfTripura.add("Gumti Hydro Dam");
		damsOfTripura.add("gadag");

		Collection<String> damsOfUttarPradesh = new ArrayList<String>(); // 26
		damsOfUttarPradesh.add("Rihand ");
		damsOfUttarPradesh.add("Rajghat ");
		damsOfUttarPradesh.add("Matatila ");
		damsOfUttarPradesh.add("Dhanraul ");
		damsOfUttarPradesh.add("Parichha ");
		damsOfUttarPradesh.add("Ganges Barrage");
		damsOfUttarPradesh.add("Sharda Barrage");

		Collection<String> damsOfUttarakhand = new ArrayList<String>(); // 27
		damsOfUttarakhand.add("baigul ");
		damsOfUttarakhand.add("Baur ");
		damsOfUttarakhand.add("bhimtal ");
		damsOfUttarakhand.add("Dhauliganga ");
		damsOfUttarakhand.add("Dhora ");
		damsOfUttarakhand.add("Haripura ");
		damsOfUttarakhand.add("jamrani ");
		damsOfUttarakhand.add("Koteshwar ");
		damsOfUttarakhand.add("Tehri ");
		damsOfUttarakhand.add("Lakhwar ");

		Collection<String> damsOfWestBengal = new ArrayList<String>(); // 28
		damsOfWestBengal.add("Bakreshwar ");
		damsOfWestBengal.add("	bandhu ");
		damsOfWestBengal.add("Bara Mandira ");
		damsOfWestBengal.add("Barabhum ");

		Collection<String> damsOfJammuAndKashmir = new ArrayList<String>(); // 29
		damsOfJammuAndKashmir.add("Baglihar ");
		damsOfJammuAndKashmir.add("Bhakra Nangal ");
		damsOfJammuAndKashmir.add("Sardar Sarovar ");
		damsOfJammuAndKashmir.add("tehri ");
		damsOfJammuAndKashmir.add("Hirakud ");
		damsOfJammuAndKashmir.add("Tungabhadra ");
		damsOfJammuAndKashmir.add("Dantiwada ");
		damsOfJammuAndKashmir.add("Gangapur ");
		damsOfJammuAndKashmir.add("Yeldari ");

		Collection<String> damsInIndia = new ArrayList<String>();
		damsInIndia.addAll(damsOfChhattisgarh);
		damsInIndia.addAll(damsOfHimachalPradesh);
		damsInIndia.addAll(damsOfArunachalPradesh);
		damsInIndia.addAll(damsOfJammuAndKashmir);
		damsInIndia.addAll(damsOfWestBengal);
		damsInIndia.addAll(damsOfUttarakhand);
		damsInIndia.addAll(damsOfUttarPradesh);
		damsInIndia.addAll(damsOfTripura);
		damsInIndia.addAll(damsOfTelangana);
		damsInIndia.addAll(damsOfTamilNadu);
		damsInIndia.addAll(damsOfSikkim);
		damsInIndia.addAll(damsOfNagaland);
		damsInIndia.addAll(damsOfPunjab);
		damsInIndia.addAll(damsOfMeghalaya);
		damsInIndia.addAll(damsOfAndhraPradesh);
		damsInIndia.addAll(damsOfKarnataka);
		damsInIndia.addAll(damsOfBihar);
		damsInIndia.addAll(damsOfGoa);
		damsInIndia.addAll(damsOfGujarat);
		damsInIndia.addAll(damsOfKerala);
		damsInIndia.addAll(damsOfJharkhand);
		damsInIndia.addAll(damsOfHaryana);
		damsInIndia.addAll(damsOfMadhyaPradesh);
		damsInIndia.addAll(damsOfMaharashtra);
		damsInIndia.addAll(damsOfManipur);
		damsInIndia.addAll(damsOfMizoram);
		damsInIndia.addAll(damsOfOdisha);
		damsInIndia.addAll(damsOfRajasthan);

		System.out.println("indian dams colletion : " + damsInIndia);

		System.out.println("dams in india : " + damsInIndia.size());

		Iterator<String> ref = damsInIndia.iterator();
		while (ref.hasNext()) {
			String element = (String) ref.next();
			if (element.startsWith("T")) {
				System.err.println(element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> ref1 = damsInIndia.iterator();
		while (ref1.hasNext()) {
			String String = (String) ref1.next();
			if (String.endsWith("ra")) {
				System.err.println(String);
			}
		}
		System.out.println(System.lineSeparator());
		Iterator<String> ref2 = damsInIndia.iterator();
		while (ref2.hasNext()) {
			String element = (String) ref2.next();
			if (element.length() <= 15) {
				System.out.println(element);
			}
		}
		System.out.println(System.lineSeparator());

		Iterator<String> Upper = damsInIndia.iterator();
		while (Upper.hasNext()) {
			String element = (String) Upper.next();
			System.out.println(element.toUpperCase());

		}
		System.out.println(System.lineSeparator());
		Iterator<String> lower = damsInIndia.iterator();
		while (lower.hasNext()) {
			String element = (String) lower.next();
			System.out.println(element.toLowerCase());
		}
		Iterator<String> reff = damsInIndia.iterator();
		while (reff.hasNext()) {
			String value = (String) reff.next();
			StringBuffer buff = new StringBuffer(value);
			buff.reverse();
			String name = buff.toString();
			if (value.equals(buff)) {
				System.out.println("dam name is palindrome" + buff);
			}

		}
		System.out.println("before remove-"+damsInIndia.size());
		Iterator<String> revenue = damsInIndia.iterator();
		while (revenue.hasNext()) {
			String str = (String) revenue.next();
			if (str.contains("p")) {
				revenue.remove();
			}
		}
		System.out.println("after remove-"+damsInIndia.size());

	}

}
