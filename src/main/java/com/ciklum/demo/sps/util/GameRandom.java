package com.ciklum.demo.sps.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameRandom {

	private static final List<GameChoise> VALUES = Collections.unmodifiableList(Arrays.asList(GameChoise.values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static GameChoise randomLetter()  {
		  return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	
}
