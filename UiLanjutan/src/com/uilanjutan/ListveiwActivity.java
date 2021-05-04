package com.uilanjutan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListveiwActivity extends Activity {
	
	ListView lv;
    String[] item = {"Nasi Goreng","Mie Goreng",
                                  "Mie Rebus","Soto Medan",
                                  "Soto Ayam","Ayam Goreng"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listveiw);
		
		lv=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String> array_item = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,item);
        lv.setAdapter(array_item);
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(ListveiwActivity.this, "Kamu Memilih" + item[arg2], Toast.LENGTH_SHORT).show();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listveiw, menu);
		return true;
	}

}
