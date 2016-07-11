package com.ciklum.demo.sps.test;

import com.ciklum.demo.sps.business.SpsGameBusiness;
import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameConstants;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

import junit.framework.TestCase;

/**
 * The Class PaperTest.
 */
public class PaperTest extends TestCase {

	
	/**
	 * Test paper challeges paper.
	 */
	public void testPaperChallegesPaper() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.PAPER);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.TIE.getResultValue());
	}
	
	
	/**
	 * Test paper challeges scissors.
	 */
	public void testPaperChallegesScissors() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.SCISSORS);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.LOSE.getResultValue());
	}
	
	/**
	 * Test paper challeges rock.
	 */
	public void testPaperChallegesRock() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME, GameChoise.ROCK);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.WIN.getResultValue());
	}
	
	/**
	 * Test paper challegesunknown.
	 */
	public void testPaperChallegesunknown() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME);
		player2.setPlayerName(GameConstants.PLAYER_TWO_NAME);
		player2.setChoise(GameRandom.randomChoise());
		
		assertTrue (player2.getPlayerName().equals(GameConstants.PLAYER_TWO_NAME));
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.TIE.getResultValue()
				|| SpsGameBusiness.playOneGame(player1, player2)==GameResult.WIN.getResultValue()
				||SpsGameBusiness.playOneGame(player1, player2)==GameResult.LOSE.getResultValue()
				);
	}
	
	/**
	 * Test paper challeges not ready player 2.
	 */
	public void testPaperChallegesNotReadyPlayer2() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = new Player(GameConstants.PLAYER_TWO_NAME);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.NO_VALID.getResultValue());
	}
	
	/**
	 * Test paper challeges null player 2.
	 */
	public void testPaperChallegesNullPlayer2() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = null;
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.NO_VALID.getResultValue());
	}
	
	/**
	 * Test paper challeges un known player 2.
	 */
	public void testPaperChallegesUnKnownPlayer2() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		Player player2 = new Player(null);
		
		assertTrue(SpsGameBusiness.playOneGame(player1, player2)==GameResult.NO_VALID.getResultValue());
		player2.setPlayerName("");
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
	

	/**
	 * Test who is the player.
	 */
	public void testWhoIsThePlayer() {
		Player player1 = new Player(GameConstants.PLAYER_ONE_NAME, GameChoise.PAPER);
		System.out.println(player1.toString());
	}
	
	
	
}
