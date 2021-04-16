package com.evta.bangundatarapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	Button click_me,segitiga,lingkaran;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        click_me = (Button)findViewById(R.id.btn_hitung);
		segitiga = (Button)findViewById(R.id.button2);
		lingkaran = (Button)findViewById(R.id.button3);
		
		click_me.setOnClickListener(this);
		segitiga.setOnClickListener(this);
		lingkaran.setOnClickListener(this);	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.btn_hitung:
			Toast.makeText(MainActivity.this, "Hallo Ini adalah Program Sederhana Bangun Datar", Toast.LENGTH_LONG).show();
			break;
		case R.id.button2:
			startActivity(new Intent(MainActivity.this,LuasSegiTigaActivity.class));
		case R.id.button3:
			startActivity(new Intent(MainActivity.this,LuasLingkaranActivity.class));
			break;		
		default:
			break;
		}	
		
	}
    
}
