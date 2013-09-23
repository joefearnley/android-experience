package com.joefearnley.baseballroster.backend.service;

import java.util.ArrayList;

import android.widget.ArrayAdapter;

import com.joefearnley.baseballroster.backend.controller.BaseballRosterController;

public class BaseballRosterService {

	private BaseballRosterController baseballRosterController;

	public BaseballRosterService() {
		this.baseballRosterController = new BaseballRosterController();
	}
	
	public void addPlayer(String playerName) {
		this.baseballRosterController.addPlayer(playerName);
	}

	public void updatePlayers(ArrayAdapter<String> arrayAdapter) {
		this.baseballRosterController.updatePlayers(arrayAdapter);
	}

	public ArrayList<String> getPlayerList() {
		return this.baseballRosterController.getPlayerList();
	}

}
