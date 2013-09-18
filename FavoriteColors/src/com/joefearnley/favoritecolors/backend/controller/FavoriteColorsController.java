package com.joefearnley.favoritecolors.backend.controller;

import java.util.ArrayList;

public class FavoriteColorsController {

	private FavoriteColorsController favoriteColorsController;
	
	public FavoriteColorsController() {
		this.favoriteColorsController = new FavoriteColorsController();
	}
	
	public void addColor(String color) {
		this.favoriteColorsController.addColor(color);
	}
	
	public ArrayList<String> findAllColors() {
		return this.favoriteColorsController.findAllColors();
	}
}
