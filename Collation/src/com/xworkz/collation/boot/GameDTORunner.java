package com.xworkz.collation.boot;

import com.xworkz.collation.dto.GameDTO;

public class GameDTORunner {

	public static void main(String[] args) {
		GameDTO dto=new GameDTO("Cricket","outdoor",11);
		GameDTO dto1=new GameDTO("Kabaddi","outdoor",7);
		dto.toString();
	}

}
