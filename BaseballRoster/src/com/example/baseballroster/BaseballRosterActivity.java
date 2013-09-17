package com.example.baseballroster;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BaseballRosterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baseball_roster_activity);

		ListView listView = (ListView) findViewById(R.id.baseballRosterView);
		List<String> players = new ArrayList<String>();
		players.add("Orel Hershiser");
		players.add("Kirk Gibson");
		players.add("John Kruk");
		players.add("Dwight Gooden");
		players.add("Greg Maddux");

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.baseball_roster_list_item, players);
		listView.setAdapter(arrayAdapter);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.new_player:
			Intent intent = new Intent(this, NewPlayerActivity.class);
			startActivity(intent);
			return true;
		case R.id.action_settings:
			Toast.makeText(this, "Hello! I'm Settings!", Toast.LENGTH_LONG).show();
			break;
		}
		
		return false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baseball_roster_menu, menu);
		return true;
	}

}
