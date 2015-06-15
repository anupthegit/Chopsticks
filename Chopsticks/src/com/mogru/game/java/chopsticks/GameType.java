package com.mogru.game.java.chopsticks;

import lombok.Getter;

public enum GameType {
	CLASSIC(1), LEFTOVERS(2), EXACT(3);
	
	private @Getter int gameType;
	
	GameType(int gameType){
		this.gameType = gameType;
	}
}
