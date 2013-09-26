package com.joefearnley.baseballroster.config;

public enum Config {

	STACKMOB_PUBLIC_KEY("");
	
	private String text;
	
	Config(String text) {
		this.text = text;
	}

	public String toString() {
		return this.text;
	}
}