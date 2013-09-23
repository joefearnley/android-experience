package com.joefearnley.baseballroster.frontend;

import com.joefearnley.baseballroster.R;
import com.joefearnley.baseballroster.backend.service.BaseballRosterService;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BaseballRosterActivity extends Activity {

	private BaseballRosterService service;
	private ArrayAdapter<String> arrayAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baseball_roster_activity);

		service = ((BaseballRosterApplication) getApplication()).getService();
		
		ListView listView = (ListView) findViewById(R.id.baseballRosterView);
		arrayAdapter = new ArrayAdapter<String>(this, R.layout.baseball_roster_list_item, service.getPlayerList());
		listView.setAdapter(arrayAdapter);

		service.updatePlayers(arrayAdapter);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.new_player:
				Intent intent = new Intent(this, NewPlayerActivity.class);
				startActivity(intent);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baseball_roster_menu, menu);
		return true;
	}
	
	@Override
	public void onResume() {
		if(arrayAdapter != null) {
			service.updatePlayers(arrayAdapter);
		}
		super.onResume();
	}
}
