package com.joefearnley.baseballroster.backend.model;

import com.stackmob.sdk.model.StackMobModel;

public class Player extends StackMobModel {

	private String name;
	
	public Player(String name) {
		super(Player.class);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
