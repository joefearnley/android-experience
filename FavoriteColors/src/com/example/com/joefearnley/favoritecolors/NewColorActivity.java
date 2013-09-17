package com.example.com.joefearnley.favoritecolors;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class NewColorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_color_activity);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_new:
			Toast.makeText(this, "Hello! I'm toast!", Toast.LENGTH_LONG).show();
			break;
		case R.id.action_settings:
			Intent intent = new Intent(this, FavoriteColorsActivity.class);
			startActivity(intent);
			return true;
		}

		return false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
