package com.joefearnley.baseballroster.config;

public enum Config {

	STACKMOB_PUBLIC_KEY("5ec4cc67-3631-4f1c-97f4-a88955b02cef");
	
	private String text;
	
	Config(String text) {
		this.text = text;
	}

	public String toString() {
		return this.text;
	}
}
