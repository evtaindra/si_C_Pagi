package com.evta.bangundatarapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LuasLingkaranActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_luas_lingkaran);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.luas_lingkaran, menu);
		return true;
	}

}
