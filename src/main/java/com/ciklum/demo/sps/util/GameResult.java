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
	
	public GameResult getResult(int result) {
		switch (result) {
			case 0: return TIE; 
			case 1: return WIN;
			case 2: return LOOSE;
			default: return NO_VALID;
		}
	}
	
	
}
