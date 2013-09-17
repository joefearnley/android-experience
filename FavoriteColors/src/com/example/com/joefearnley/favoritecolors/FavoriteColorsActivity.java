package com.example.com.joefearnley.favoritecolors;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FavoriteColorsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favorite_colors);
		
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
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
