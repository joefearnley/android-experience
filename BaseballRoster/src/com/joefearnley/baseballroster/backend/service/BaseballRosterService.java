package com.joefearnley.baseballroster.backend.service;

import java.util.ArrayList;

import com.joefearnley.baseballroster.backend.controller.BaseballRosterController;

public class BaseballRosterService {

	private BaseballRosterController baseballRosterController;
	
	public BaseballRosterService() {
		this.baseballRosterController = new BaseballRosterController();
	}
	
	public void addPlayer(String player) {
		this.baseballRosterController.addPlayer(player);
	}
	
	public ArrayList<String> findAllPlayers() {
		return this.baseballRosterController.findAll();
	}
}
