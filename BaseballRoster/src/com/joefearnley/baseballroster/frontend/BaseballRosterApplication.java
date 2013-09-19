package com.joefearnley.baseballroster.frontend;

import android.app.Application;

import com.joefearnley.baseballroster.backend.service.BaseballRosterService;

public class BaseballRosterApplication extends Application {

	private static BaseballRosterApplication application;
	private BaseballRosterService service;
	
	public BaseballRosterApplication getInstance() {
		return application;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		application = this;
		application.initialize();
	}

	private void initialize() {
		service = new BaseballRosterService();
	}

	public BaseballRosterService getService() {
		return service;
	}
}
