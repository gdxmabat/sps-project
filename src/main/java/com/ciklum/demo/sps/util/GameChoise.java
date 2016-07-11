package com.ciklum.demo.sps.util;

/**
 * The Enum GameChoise.
 */
public enum GameChoise {

/** ALL GAME POSIBILITIES. */
	ROCK(1), 
	
	/** The paper. */
	PAPER(2), 
	
	/** The scissors. */
	SCISSORS(3), 
	
	/** The no valid. */
	NO_VALID(-1);
	
	/** The choise value. */
	int choiseValue;

	
	/**
	 * Instantiates a new game choise.
	 *
	 * @param value the value
	 */
	private GameChoise(int value) {
		this.choiseValue = value;
	}

/**
 * Gets the choise value.
 *
 * @return int representation of enum value
 */
	public int getChoiseValue() {
		return choiseValue;
	}
	
	
	
}
