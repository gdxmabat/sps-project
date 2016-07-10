package com.ciklum.demo.sps.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class GameRandom.
 */
public class GameRandom {

	/** The Constant VALUES. */
	private static final List<GameChoise> VALUES = Collections.unmodifiableList(Arrays.asList(GameChoise.values()));
	
	/** The Constant SIZE. */
	private static final int SIZE = VALUES.size();
	
	/** The Constant RANDOM. */
	private static final Random RANDOM = new Random();

	/**
	 * Random letter.
	 *
	 * @return the game choise
	 */
	public static GameChoise randomChoise()  {
		  return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	
}
