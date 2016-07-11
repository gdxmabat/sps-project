package com.ciklum.demo.sps.test;

import com.ciklum.demo.sps.business.SpsGameBusiness;
import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameConstants;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

import junit.framework.TestCase;

/**
 * The Class ScissorsTest.
 */
public class ScissorsTest extends TestCase {

	/**
	 * Test scissors challeges paper.
	 */
	public void testScissorsChallegesPaper() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.SCISSORS);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.PAPER);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.WIN.getResultValue());
	}
	
	
	/**
	 * Test scissors challeges scissors.
	 */
	public void testScissorsChallegesScissors() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.SCISSORS);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.SCISSORS);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.TIE.getResultValue());
	}
	
	/**
	 * Test scissors challeges rock.
	 */
	public void testScissorsChallegesRock() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.SCISSORS);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.ROCK);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.LOSE.getResultValue());
	}
	
	/**
	 * Test scissors challegesunknown.
	 */
	public void testScissorsChallegesunknown() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.SCISSORS);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameRandom.randomChoise());
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.TIE.getResultValue()
				|| SpsGameBusiness.playOneGame(player1, player2)==GameResult.WIN.getResultValue()
				||SpsGameBusiness.playOneGame(player1, player2)==GameResult.LOSE.getResultValue()
				);
	}
	
	/**
	 * Test scissors challeges not ready player 2.
	 */
	public void testScissorsChallegesNotReadyPlayer2() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.SCISSORS);
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
