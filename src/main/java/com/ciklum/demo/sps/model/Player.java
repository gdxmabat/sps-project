package com.ciklum.demo.sps.model;

import org.apache.log4j.Logger;

import com.ciklum.demo.sps.exception.SPSException;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameConstants;
import com.ciklum.demo.sps.util.GameResult;

/**
 * The Class Player.
 */
public class Player implements Comparable<Player>{

	final static Logger LOGGER = Logger.getLogger(Player.class);
	
	/** The player name. */
	String playerName;
	
	/** The choise. */
	GameChoise choise;
	
	/**
	 * Instantiates a new player.
	 *
	 * @param playerName the player name
	 * @param choise the choise
	 */
	public Player(String playerName, GameChoise choise) {
		this.playerName = playerName;
		this.choise = choise;
	}
	
	
	/**
	 * Instantiates a new player.
	 *
	 * @param playerName the player name
	 */
	public Player(String playerName) {
		this.playerName = playerName;
	}


	/**
	 * Gets the player name.
	 *
	 * @return the player name
	 */
	public String getPlayerName() {
		return playerName;
	}


	/**
	 * Sets the player name.
	 *
	 * @param playerName the new player name
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	/**
	 * Gets the choise.
	 *
	 * @return the choise
	 */
	public GameChoise getChoise() {
		return choise;
	}


	/**
	 * Sets the choise.
	 *
	 * @param choise the new choise
	 */
	public void setChoise(GameChoise choise) {
		this.choise = choise;
	}

	/**
	 * Validate if player is ready to play
	 * @return boolean true if it ok. False if not ready. 
	 */
	public boolean validatePlayerStatus() {
		if (null == this.playerName || "".equals(this.playerName)) return false;
		else {
			return (null == this.getChoise())?false:true;
		}
	}
	

	/** 
	 * Compare choise of this player with other player. 
	 * @param otherPlayer 
	 * @return 0: TIE | 1: WIN PLAYER1 (AND LOST PLAYER2) | 2: WIN PLAYER2(AND LOST PLAYER1) | 3: NO VALID GAME
	 */
	public int compareTo(Player otherPlayer) {
		try {
			if (!validatePlayerStatus()) {
				throw new SPSException("Not Valid status for this player");
			} else {
				if (null == otherPlayer || !otherPlayer.validatePlayerStatus()) {
					throw new SPSException("Not Valid status for opponent ");
				} else {
					LOGGER.debug("the result of evaluate "+this.getChoise()+" and "+otherPlayer.getChoise()+" is "+(GameConstants.MAX_CHOISE_POSIBILITIES + this.getChoise().getChoiseValue() - otherPlayer.getChoise().getChoiseValue() ) % GameConstants.MAX_CHOISE_POSIBILITIES);
					return  (GameConstants.MAX_CHOISE_POSIBILITIES + this.getChoise().getChoiseValue() - otherPlayer.getChoise().getChoiseValue() ) % GameConstants.MAX_CHOISE_POSIBILITIES;
				}
				
			}
			
		}catch(SPSException ex) {
			LOGGER.error(ex.getMessage());
			return GameResult.NO_VALID.getResultValue();
			
		}
	}
	
	@Override
	public String toString(){
		return "Player's name: "+this.playerName+" - choise: "+this.choise;
	}
	
	
	
}
