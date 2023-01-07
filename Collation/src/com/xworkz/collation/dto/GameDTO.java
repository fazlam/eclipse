package com.xworkz.collation.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {
	private String name;
	private String type;
	private Integer totalPlayers;
	
	public GameDTO() {
		System.out.println("No arg constr......");
	}

	public GameDTO(String name, String type, Integer totalPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", totalPlayers=" + totalPlayers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTotalPlayers() {
		return totalPlayers;
	}

	public void setTotalPlayers(Integer totalPlayers) {
		this.totalPlayers = totalPlayers;
	}

}
