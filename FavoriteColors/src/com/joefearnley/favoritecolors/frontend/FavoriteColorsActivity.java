package com.joefearnley.favoritecolors.frontend;

import java.util.ArrayList;
import java.util.List;

import com.joefearnley.favoritecolors.R;
import com.joefearnley.favoritecolors.backend.service.FavoriteColorsService;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FavoriteColorsActivity extends Activity {

	private FavoriteColorsService service = null;
	private ArrayAdapter<String> arrayAdapter;
	private List<String> favoriteColors = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.favorite_colors_activity);
		
		service = ((FavoriteColorsApplication) getApplication()).getService();
		favoriteColors = service.findAllColors();

		ListView listView = (ListView) findViewById(R.id.favoriteColorsListView);
		arrayAdapter = new ArrayAdapter<String>(this, R.layout.favorite_colors_list_item, favoriteColors);
		listView.setAdapter(arrayAdapter);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.menu_new:
				Intent intent = new Intent(this, NewColorActivity.class);
				startActivity(intent);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.favorite_colors_menu, menu);
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
