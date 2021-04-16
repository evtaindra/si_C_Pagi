package com.evta.bangundatarapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegiTigaActivity extends Activity {
	
	EditText Alas,Tinggi;
	TextView Luas;
	Button Proses;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_luas_segi_tiga);
		 Alas = (EditText)findViewById(R.id.et_alas);
		    Tinggi = (EditText)findViewById(R.id.et_tinggi);
		    Luas = (TextView)findViewById(R.id.txHasil);
		    Proses = (Button)findViewById(R.id.btn_hitung);
		    Proses.setOnClickListener(new View.OnClickListener() {			
				@Override
				public void onClick(View arg0) {
					int alas = Integer.parseInt(Alas.getText().toString());
					int tinggi = Integer.parseInt(Tinggi.getText().toString());
					Luas.setText(Double.toString(0.5*alas*tinggi));					
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.luas_segi_tiga, menu);
		return true;
	}

}
