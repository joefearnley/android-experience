package com.joefearnley.baseballroster.backend.controller;

import java.util.ArrayList;
import java.util.List;

import android.os.Handler;
import android.widget.ArrayAdapter;

import com.joefearnley.baseballroster.backend.model.Player;
import com.stackmob.sdk.api.StackMobQuery;
import com.stackmob.sdk.callback.StackMobQueryCallback;
import com.stackmob.sdk.exception.StackMobException;

public class BaseballRosterController {

	private ArrayList<String> playerList;
	private Player playerModel;
	private final Handler listHandler = new Handler();

	public BaseballRosterController() {
		playerList = new ArrayList<String>();
	}

	public void addPlayer(String playerName) {
		playerList.add(playerName);
		playerModel = new Player(playerName);
		playerModel.save();
	}

	public ArrayList<String> getPlayerList() {
		return playerList;
	}

	public void updatePlayers(final ArrayAdapter<String> arrayAdapter) {
		Player.query(Player.class, new StackMobQuery("player"), new StackMobQueryCallback<Player>(){
		    @Override
		    public void success(List<Player> result) {
		    	playerList.clear();

		    	for (Player player : result) {
		    		playerList.add(player.getName());
				}

		    	listHandler.post(new Runnable() { 
				    public void run() { 
				    	arrayAdapter.notifyDataSetChanged();
				    } 
				});
		    }

		    @Override
		    public void failure(StackMobException e) {
		    }
		});
	}

}
