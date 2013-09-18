package com.joefearnley.favoritecolors.backend.service;

import java.util.ArrayList;

public class FavoriteColorsService {

	private ArrayList<String> colorList;
	
	public FavoriteColorsService() {
		colorList = new ArrayList<String>();
	}
	
	public void addColor(String color) {
		colorList.add(color);
	}
	
	public ArrayList<String> findAll() {
		return colorList;
	}

}
