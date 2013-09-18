package com.joefearnley.favoritecolors.frontend;

import com.example.com.joefearnley.favoritecolors.R;
import com.joefearnley.favoritecolors.backend.service.FavoriteColorsService;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class NewColorActivity extends Activity {
	
	EditText txtColorName;
	private FavoriteColorsService service = null;
	
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
	
	private void addNewColor() {
		String colorName = txtColorName.getText().toString();
		service.addColor(colorName);
	}

}
