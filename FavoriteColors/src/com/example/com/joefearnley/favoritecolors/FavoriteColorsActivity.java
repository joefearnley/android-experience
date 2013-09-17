package com.example.com.joefearnley.favoritecolors;

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

public class FavoriteColorsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.favorite_colors_activity);
		
		ListView listView = (ListView) findViewById(R.id.favoriteColorsListView);
		List<String> favoriteColors = new ArrayList<String>();
		favoriteColors.add("Blue");
		favoriteColors.add("Black");
		favoriteColors.add("Red");
		favoriteColors.add("Green");

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.favorite_colors_list_item, favoriteColors);
		listView.setAdapter(arrayAdapter);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_new:
			Intent intent = new Intent(this, NewColorActivity.class);
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
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
