package com.joefearnley.baseballroster.frontend;

import com.joefearnley.baseballroster.R;
import com.joefearnley.baseballroster.backend.service.BaseballRosterService;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class NewPlayerActivity extends Activity {

	private EditText txtPlayerName;
	private BaseballRosterService service;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_player_activity);

		service = ((BaseballRosterApplication) getApplication()).getService();

		txtPlayerName = (EditText) this.findViewById(R.id.txtFirstName);
		txtPlayerName.requestFocus();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.menu_submit:
				addNewPlayer();
				this.finish();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	private void addNewPlayer() {
		String playerName = txtPlayerName.getText().toString();
		service.addPlayer(playerName);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_player_menu, menu);
		return true;
	}

}
