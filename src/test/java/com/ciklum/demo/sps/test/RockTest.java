package com.ciklum.demo.sps.test;

import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

import junit.framework.TestCase;

public class RockTest extends TestCase {

	public void testRockChallegesPaper() {
		Player player1 = new Player("player1", GameChoise.ROCK);
		Player player2 = new Player("player2", GameChoise.PAPER);
		
		assertTrue(player1.compareTo(player2)==GameResult.LOOSE.getResultValue());
	}
	
	
	public void testRockChallegesScissors() {
		Player player1 = new Player("player1", GameChoise.ROCK);
		Player player2 = new Player("player2", GameChoise.SCISSORS);
		
		assertTrue(player1.compareTo(player2)==GameResult.WIN.getResultValue());
	}
	
	public void testRockChallegesRock() {
		Player player1 = new Player("player1", GameChoise.ROCK);
		Player player2 = new Player("player2", GameChoise.ROCK);
		
		assertTrue(player1.compareTo(player2)==GameResult.TIE.getResultValue());
	}
	
	public void testRockChallegesunknown() {
		Player player1 = new Player("player1", GameChoise.ROCK);
		Player player2 = new Player("player2", GameRandom.randomChoise());
		
		assertTrue(player1.compareTo(player2)==GameResult.TIE.getResultValue()
				|| player1.compareTo(player2)==GameResult.WIN.getResultValue()
				||player1.compareTo(player2)==GameResult.LOOSE.getResultValue()
				);
	}
	
	public void testRockChallegesNotReadyPlayer2() {
		Player player1 = new Player("player1", GameChoise.ROCK);
		Player player2 = new Player("player2");
		
		assertTrue(player1.compareTo(player2)==GameResult.NO_VALID.getResultValue());
	}
	
	public void testNotReadyChallegesNotReadyPlayer2() {
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		
		assertTrue(player1.compareTo(player2)==GameResult.NO_VALID.getResultValue());
	}
	
	
}
