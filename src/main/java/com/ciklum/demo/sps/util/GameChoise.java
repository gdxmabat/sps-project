package com.ciklum.demo.sps.util;

/**
 * The Enum GameChoise.
 */
public enum GameChoise {


	ROCK(1), 
	PAPER(2), 
	SCISSORS(3), 
	NO_VALID(-1);
	
	/** The choise value. */
	int choiseValue;

	
	private GameChoise(int value) {
		this.choiseValue = value;
	}


	public int getChoiseValue() {
		return choiseValue;
	}
	
	
	
}
