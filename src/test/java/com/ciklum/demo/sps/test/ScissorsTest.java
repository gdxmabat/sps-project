package com.ciklum.demo.sps.test;

import com.ciklum.demo.sps.model.Player;
import com.ciklum.demo.sps.util.GameChoise;
import com.ciklum.demo.sps.util.GameRandom;
import com.ciklum.demo.sps.util.GameResult;

import junit.framework.TestCase;

public class ScissorsTest extends TestCase {

	public void testScissorsChallegesPaper() {
		Player player1 = new Player("player1", GameChoise.SCISSORS);
		Player player2 = new Player("player2", GameChoise.PAPER);
		
		assertTrue(player1.compareTo(player2)==GameResult.WIN.getResultValue());
	}
	
	
	public void testScissorsChallegesScissors() {
		Player player1 = new Player("player1", GameChoise.SCISSORS);
		Player player2 = new Player("player2", GameChoise.SCISSORS);
		
		assertTrue(player1.compareTo(player2)==GameResult.TIE.getResultValue());
	}
	
	public void testScissorsChallegesRock() {
		Player player1 = new Player("player1", GameChoise.SCISSORS);
		Player player2 = new Player("player2", GameChoise.ROCK);
		
		assertTrue(player1.compareTo(player2)==GameResult.LOOSE.getResultValue());
	}
	
	public void testScissorsChallegesunknown() {
		Player player1 = new Player("player1", GameChoise.SCISSORS);
		Player player2 = new Player("player2", GameRandom.randomChoise());
		
		assertTrue(player1.compareTo(player2)==GameResult.TIE.getResultValue()
				|| player1.compareTo(player2)==GameResult.WIN.getResultValue()
				||player1.compareTo(player2)==GameResult.LOOSE.getResultValue()
				);
	}
	
	public void testScissorsChallegesNotReadyPlayer2() {
		Player player1 = new Player("player1", GameChoise.SCISSORS);
		Player player2 = new Player("player2");
		
		assertTrue(player1.compareTo(player2)==GameResult.NO_VALID.getResultValue());
	}
	
	public void testNotReadyChallegesNotReadyPlayer2() {
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		
		assertTrue(player1.compareTo(player2)==GameResult.NO_VALID.getResultValue());
	}
	
	
}
