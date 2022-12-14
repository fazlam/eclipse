package com.xworkz.ipl.Boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository repository = new IplRepositoryImpl();
		IplDTO dto=new IplDTO();
		dto.setTeamName("RCB");
		dto.setCaptainName("virat");
		dto.setOwnerAlive(true);
		dto.setPurse(85);
		dto.setWins(107);
		dto.setDefeats(113);
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.now());
		repository.create(dto);
		
		System.out.println("====================================================================");	
		IplRepository repository2 = new IplRepositoryImpl();
		IplDTO dto2=new IplDTO();
		dto2.setTeamName("MI");
		dto2.setCaptainName("Rohit sharma");
		dto2.setOwnerAlive(true);
		dto2.setPurse(80);
		dto2.setWins(50);
		dto2.setDefeats(200);
		dto2.setCreatedBy("SYSTEM");
		dto2.setCreatedDate(LocalDateTime.now());
		repository2.create(dto2);
		
		System.out.println("====================================================================");
		IplRepository repository3 = new IplRepositoryImpl();
		IplDTO dto3=new IplDTO();
		dto3.setTeamName("CSK");
		dto3.setCaptainName("Dhoni");
		dto3.setOwnerAlive(true);
		dto3.setPurse(86);
		dto3.setWins(150);
		dto3.setDefeats(100);
		dto3.setCreatedBy("SYSTEM");
		dto3.setCreatedDate(LocalDateTime.now());
		repository3.create(dto3);
		
		System.out.println("====================================================================");
		IplRepository repository4 = new IplRepositoryImpl();
		IplDTO dto4=new IplDTO();
		dto4.setTeamName("SRH");
		dto4.setCaptainName("Dhawan");
		dto4.setOwnerAlive(true);
		dto4.setPurse(70);
		dto4.setWins(113);
		dto4.setDefeats(100);
		dto4.setCreatedBy("SYSTEM");
		dto4.setCreatedDate(LocalDateTime.now());
		repository4.create(dto4);
		
		System.out.println("====================================================================");
		IplRepository repository5 = new IplRepositoryImpl();
		IplDTO dto5=new IplDTO();
		dto5.setTeamName("Punjab");
		dto5.setCaptainName("kl RAHUL");
		dto5.setOwnerAlive(true);
		dto5.setPurse(50);
		dto5.setWins(100);
		dto5.setDefeats(120);
		dto5.setCreatedBy("SYSTEM");
		dto5.setCreatedDate(LocalDateTime.now());
		repository5.create(dto5);
		
		System.out.println("====================================================================");
		IplRepository repository6 = new IplRepositoryImpl();
		IplDTO dto6=new IplDTO();
		dto6.setTeamName("Rajistan Roayl");
		dto6.setCaptainName("Sanju Samasson");
		dto6.setOwnerAlive(true);
		dto6.setPurse(70);
		dto6.setWins(120);
		dto6.setDefeats(100);
		dto6.setCreatedBy("SYSTEM");
		dto6.setCreatedDate(LocalDateTime.now());
		repository6.create(dto6);
		System.out.println("====================================================================");
		IplRepository repository7 = new IplRepositoryImpl();
		IplDTO dto7=new IplDTO();
		dto7.setTeamName("Dehali capital");
		dto7.setCaptainName("Shryes Iyer");
		dto7.setOwnerAlive(true);
		dto7.setPurse(70);
		dto7.setWins(130);
		dto7.setDefeats(100);
		dto7.setCreatedBy("SYSTEM");
		dto7.setCreatedDate(LocalDateTime.now());
		repository7.create(dto7);
		
		System.out.println("====================================================================");
		IplRepository repository8 = new IplRepositoryImpl();
		IplDTO dto8=new IplDTO();
		dto8.setTeamName("Gujrat Lines");
		dto8.setCaptainName("Suresh Raina");
		dto8.setOwnerAlive(true);
		dto8.setPurse(30);
		dto8.setWins(50);
		dto8.setDefeats(100);
		dto8.setCreatedBy("SYSTEM");
		dto8.setCreatedDate(LocalDateTime.now());
		repository8.create(dto8);
		System.out.println("====================================================================");
		IplRepository repository9 = new IplRepositoryImpl();
		IplDTO dto9=new IplDTO();
		dto9.setTeamName("Luckhanva");
		dto9.setCaptainName("Hardik pandy");
		dto9.setOwnerAlive(true);
		dto9.setPurse(40);
		dto9.setWins(50);
		dto9.setDefeats(70);
		dto9.setCreatedBy("SYSTEM");
		dto9.setCreatedDate(LocalDateTime.now());
		repository9.create(dto9);
		
		System.out.println("====================================================================");
		IplRepository repository10 = new IplRepositoryImpl();
		IplDTO dto10=new IplDTO();
		dto10.setTeamName("kochi");
		dto10.setCaptainName("Rahul dravid");
		dto10.setOwnerAlive(true);
		dto10.setPurse(70);
		dto10.setWins(100);
		dto10.setDefeats(120);
		dto10.setCreatedBy("SYSTEM");
		dto10.setCreatedDate(LocalDateTime.now());
		repository10.create(dto10);
		
		System.out.println("====================================================================");
		IplRepository repository11 = new IplRepositoryImpl();
		IplDTO dto11=new IplDTO();
		dto11.setTeamName("pune");
		dto11.setCaptainName("Smith");
		dto11.setOwnerAlive(true);
		dto11.setPurse(20);
		dto11.setWins(50);
		dto11.setDefeats(80);
		dto11.setCreatedBy("SYSTEM");
		dto11.setCreatedDate(LocalDateTime.now());
		repository11.create(dto11);
	}

}
