package com.joefearnley.favoritecolors.frontend;

import com.joefearnley.favoritecolors.R;
import com.joefearnley.favoritecolors.backend.service.FavoriteColorsService;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class NewColorActivity extends Activity {
	
	EditText txtColorName;
	private FavoriteColorsService service = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_color_activity);

		service = ((FavoriteColorsApplication) getApplication()).getService();

		txtColorName = (EditText) this.findViewById(R.id.txtColorName);
		txtColorName.requestFocus();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.menu_submit:
				addNewColor();
				NewColorActivity.this.finish();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_color_menu, menu);
		return true;
	}
	
	private void addNewColor() {
		String colorName = txtColorName.getText().toString();
		service.addColor(colorName);
	}

}
