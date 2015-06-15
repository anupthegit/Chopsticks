package com.mogru.game.java.chopsticks;

import java.util.Deque;
import java.util.Map;

import lombok.Data;

public @Data class Board {
	
	private int score;
	
	private int modulus;
	
	private Map<Integer,Integer> cache;
	
	private Deque<Board> history;
	
	private int[] hands = new int[4];
	
	private GameType gameType;
}
