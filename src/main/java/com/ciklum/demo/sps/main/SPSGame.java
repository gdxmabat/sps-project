package com.ciklum.demo.sps.main;

import org.apache.log4j.Logger;

import com.ciklum.demo.sps.exception.SPSException;
import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameConstants;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

public class SPSGame {

	final static Logger LOGGER = Logger.getLogger(SPSGame.class);
	
	public static void main(String[] args) {
		int[] totalResult = new int[4];
		Player player1 = new Player("PlayerRock",GameChoise.ROCK);
		Player player2 = new Player("Player2");
		
		
		for (int i=0;i<GameConstants.TOTAL_ROUNDS;i++) {
			player2.setChoise(GameRandom.randomChoise());
			LOGGER.debug("Player2 is thinking about ..."+player2.getChoise());
			totalResult[playOneGame(player1,player2)]++;
		}
		
		LOGGER.info("-------------------------------------------");
		LOGGER.info("TOTALS RESULT");
		LOGGER.info(player1.getPlayerName()+":");
		LOGGER.info("\tTOtal WON: "+totalResult[GameResult.WIN.getResultValue()]);
		LOGGER.info("\tTOtal LOSE: "+totalResult[GameResult.LOOSE.getResultValue()]);
		LOGGER.info(player2.getPlayerName()+":");
		LOGGER.info("\tTOtal WON: "+totalResult[GameResult.LOOSE.getResultValue()]);
		LOGGER.info("\tTOtal LOSE: "+totalResult[GameResult.WIN.getResultValue()]);
		LOGGER.info("-------------------------------------------");
		LOGGER.info("TOTALS TIED: "+totalResult[GameResult.TIE.getResultValue()]);
		LOGGER.info("TOTALS NO VALID GAMES: "+totalResult[GameResult.NO_VALID.getResultValue()]);

		
    }
	
	
	/**
	 * 
	 * Play one game
	 * @param player1 
	 * @param player2
	 * @return 0: if TIE, 1 if Player1 win, 2 if player2 win, 3 if no valid game
	 * @Throws SPSException if something wrong
	 */
	private static int playOneGame(Player player1, Player player2)
	{
		try {
			if (null == player1 || !player1.validatePlayerStatus()) {
				throw new SPSException("player1 not ready");
			}
			if (null == player2 || !player2.validatePlayerStatus()) {
				throw new SPSException("player2 not ready");
			}
			
			return player1.compareTo(player2);
			
 		}catch (SPSException ex) {
			LOGGER.error(ex.getMessage());
			return GameResult.NO_VALID.getResultValue();
		}
		
	}
	
	
}
