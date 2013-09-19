package com.joefearnley.baseballroster.backend.controller;

import java.util.ArrayList;

public class BaseballRosterController {
	private ArrayList<String> playerList;
	
	public BaseballRosterController() {
		playerList = new ArrayList<String>();
	}
	
	public void addPlayer(String player) {
		playerList.add(player);
	}
	
	public ArrayList<String> findAll() {
		return playerList;
	}
}
