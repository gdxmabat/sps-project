package com.ciklum.demo.sps.test;

import com.ciklum.demo.sps.business.SpsGameBusiness;
import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameConstants;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

import junit.framework.TestCase;

/**
 * The Class RockTest.
 */
public class RockTest extends TestCase {

	/**
	 * Test rock challeges paper.
	 */
	public void testRockChallegesPaper() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.ROCK);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.PAPER);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.LOSE.getResultValue());
	}
	
	
	/**
	 * Test rock challeges scissors.
	 */
	public void testRockChallegesScissors() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.ROCK);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.SCISSORS);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.WIN.getResultValue());
	}
	
	/**
	 * Test rock challeges rock.
	 */
	public void testRockChallegesRock() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.ROCK);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.ROCK);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.TIE.getResultValue());
	}
	
	/**
	 * Test rock challegesunknown.
	 */
	public void testRockChallegesunknown() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.ROCK);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameRandom.randomChoise());
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.TIE.getResultValue()
				|| SpsGameBusiness.playOneGame(player1, player2)==GameResult.WIN.getResultValue()
				||SpsGameBusiness.playOneGame(player1, player2)==GameResult.LOSE.getResultValue()
				);
	}
	
	/**
	 * Test rock challeges not ready player 2.
	 */
	public void testRockChallegesNotReadyPlayer2() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.ROCK);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.NO_VALID.getResultValue());
	}
	
	/**
	 * Test not ready challeges not ready player 2.
	 */
	public void testNotReadyChallegesNotReadyPlayer2() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.NO_VALID.getResultValue());
	}
	
	
}
