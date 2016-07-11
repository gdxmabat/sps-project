package com.ciklum.demo.sps.util;

/**
 * The Enum GameResult.
 */
public enum GameResult {


	/** The tie. */
	TIE(0), 
	
	/** The win. */
	WIN(1), 
	
	/** The lose. */
	LOSE(2), 
	
	/** The no valid. */
	NO_VALID(3);
	
	/** The resultValue value. */
	int resultValue;
	

	/**
	 * Instantiates a new game result.
	 *
	 * @param value the value
	 */
	private GameResult(int value){
		this.resultValue = value;
	}

	
	/**
	 * Gets the result value.
	 *
	 * @return the result value
	 */
	public int getResultValue() {
		return resultValue;
	}
	
	
}
