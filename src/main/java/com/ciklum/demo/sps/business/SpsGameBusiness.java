package com.ciklum.demo.sps.business;

import org.apache.log4j.Logger;

import com.ciklum.demo.sps.exception.SPSException;
import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameResult;

/**
 * Business class to play a game
 * if we use Spring framework (or any other IoC) we can inject this class.
 * For demo propusal i am going to use a static method of this class in the main class. 
 * @author Mario
 *
 */
public class SpsGameBusiness {

	final static Logger LOGGER = Logger.getLogger(SpsGameBusiness.class);
	
	/**
	 * 
	 * Play one game
	 * @param player1 
	 * @param player2
	 * @return 0: if TIE, 1 if Player1 won (and player2 lost), 2 if player2 won (and the player2 lost), 3 if no valid game
	 */
	public static int playOneGame(Player player1, Player player2)
	{
		try {
			//Check if the player is valid 
			if (null == player1 || !player1.validatePlayerStatus()) {
				throw new SPSException("player1 not ready");
			}
			if (null == player2 || !player2.validatePlayerStatus()) {
				throw new SPSException("player2 not ready");
			}
			
			//compare the choise of both players
			return player1.compareTo(player2);
			
 		}catch (SPSException ex) {
			LOGGER.error(ex.getMessage());
			return GameResult.NO_VALID.getResultValue();
		}
		
	} 
	
}
