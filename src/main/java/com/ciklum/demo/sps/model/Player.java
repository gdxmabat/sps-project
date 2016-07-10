package com.ciklum.demo.sps.model;

import com.ciklum.demo.sps.util.GameChoise;

public class Player implements Comparable<Player>{

	String playerName;
	
	GameChoise choise;
	
	public Player(String playerName, GameChoise choise) {
		this.playerName = playerName;
		this.choise = choise;
	}
	
	
	public Player(String playerName) {
		this.playerName = playerName;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public GameChoise getChoise() {
		return choise;
	}


	public void setChoise(GameChoise choise) {
		this.choise = choise;
	}


	public int compareTo(Player otherPlayer) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
