package com.ciklum.demo.sps.util;

public enum GameChoise {

	TIE(0), WIN(1), LOOSE(2), NO_VALID(3);
	
	int choiseValue;
	
	private GameChoise(int choiseValue){
		this.choiseValue = choiseValue;
	}

	public int getChoiseValue() {
		return choiseValue;
	}
	
	
	
	
	
}
