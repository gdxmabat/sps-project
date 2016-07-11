package com.ciklum.demo.sps.main;

import org.apache.log4j.Logger;

import com.ciklum.demo.sps.business.SpsGameBusiness;
import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameConstants;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

public class SPSGame {

	final static Logger LOGGER = Logger.getLogger(SPSGame.class);
	
	public static void main(String[] args) {
		
		
		//Integer vector used to store the final result
		//int[0] stores the games tied
		//int[1] stores the games won for player1 (and lost for player2)
		//int[2] stores the games lost for player1 (and win for player2)
		int[] totalResult = new int[4];
		
		//Init. players
		
		//Player1 always choise stone
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME,GameChoise.ROCK);
		
		//For this demo. Player2 use a simple random choise
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME);
		
		
		for (int i=0;i<GameConstants.TOTAL_ROUNDS;i++) {
			
			//define player2's choise
			player2.setChoise(GameRandom.randomChoise());
			LOGGER.debug(player2.toString());
			
			//Increase the vector position value
			totalResult[SpsGameBusiness.playOneGame(player1,player2)]++;
		}
		
		LOGGER.info("-------------------------------------------");
		LOGGER.info("TOTALS RESULT");
		LOGGER.info(player1.getPlayerName()+":");
		LOGGER.info("\tTOtal WON: "+totalResult[GameResult.WIN.getResultValue()]);
		LOGGER.info("\tTOtal LOSE: "+totalResult[GameResult.LOSE.getResultValue()]);
		LOGGER.info(player2.getPlayerName()+":");
		LOGGER.info("\tTOtal WON: "+totalResult[GameResult.LOSE.getResultValue()]);
		LOGGER.info("\tTOtal LOSE: "+totalResult[GameResult.WIN.getResultValue()]);
		LOGGER.info("-------------------------------------------");
		LOGGER.info("TOTALS TIED: "+totalResult[GameResult.TIE.getResultValue()]);
		LOGGER.info("TOTALS NO VALID GAMES: "+totalResult[GameResult.NO_VALID.getResultValue()]);
		
    }
	

	
}
