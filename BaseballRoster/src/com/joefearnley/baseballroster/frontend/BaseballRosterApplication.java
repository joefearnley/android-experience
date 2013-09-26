package com.joefearnley.baseballroster.frontend;

import java.io.InputStream;

import android.app.Application;

import com.joefearnley.baseballroster.backend.service.BaseballRosterService;
import com.joefearnley.baseballroster.config.Config;
import com.stackmob.android.sdk.common.StackMobAndroid;

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

		 InputStream is = getClass().getResourceAsStream("config.properties");
		
		StackMobAndroid.init(getApplicationContext(), 0, Config.STACKMOB_PUBLIC_KEY.toString());
	}

	private void initialize() {
		service = new BaseballRosterService();
	}

	public BaseballRosterService getService() {
		return service;
	}
}
