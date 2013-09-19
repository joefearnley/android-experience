package com.joefearnley.baseballroster.frontend;

import java.util.ArrayList;
import java.util.List;

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

	private BaseballRosterService service = null;
	private ArrayAdapter<String> arrayAdapter;
	private List<String> players = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baseball_roster_activity);

		service = ((BaseballRosterApplication) getApplication()).getService();
		players = service.findAllPlayers();

		ListView listView = (ListView) findViewById(R.id.baseballRosterView);
		arrayAdapter = new ArrayAdapter<String>(this, R.layout.baseball_roster_list_item, players);
		listView.setAdapter(arrayAdapter);
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
			arrayAdapter.notifyDataSetChanged();
		}
		super.onResume();
	}

}
