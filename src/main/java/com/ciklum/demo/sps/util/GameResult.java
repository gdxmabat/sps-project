package com.ciklum.demo.sps.util;

/**
 * The Enum GameResult.
 */
public enum GameResult {


	TIE(0), 
	WIN(1), 
	LOOSE(2), 
	NO_VALID(3);
	
	/** The resultValue value. */
	int resultValue;
	

	private GameResult(int value){
		this.resultValue = value;
	}

	
	public int getResultValue() {
		return resultValue;
	}
	
	
}
