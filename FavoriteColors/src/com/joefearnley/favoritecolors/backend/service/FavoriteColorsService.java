package com.joefearnley.favoritecolors.backend.service;

import java.util.ArrayList;

import com.joefearnley.favoritecolors.backend.controller.FavoriteColorsController;

public class FavoriteColorsService {

	private FavoriteColorsController favoriteColorsController;
	
	public FavoriteColorsService() {
		this.favoriteColorsController = new FavoriteColorsController();
	}
	
	public void addColor(String color) {
		this.favoriteColorsController.addColor(color);
	}
	
	public ArrayList<String> findAllColors() {
		return this.favoriteColorsController.findAll();
	}
}
