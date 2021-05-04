package com.uilanjutan;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends Activity {
	  EditText username, pass;
      Button bLogin,bKeluar;
      String user_name = "user";
      String password = "user1234";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
		
		  username = (EditText) findViewById(R.id.etUsername);
          pass = (EditText) findViewById(R.id.etPass);
          bLogin = (Button) findViewById(R.id.btLogin);
          bKeluar =(Button) findViewById(R.id.btKeluar);
          
          bLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 String u  = username.getText().toString();
                 String p = pass.getText().toString();
                 checkLogin(u,p);                
			}
			
		});
          
          bKeluar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(FormActivity.this,MainActivity.class);
				Toast.makeText(getApplicationContext(), "Anda Keluar", Toast.LENGTH_LONG).show();
				startActivity(intent);				 
			}
		});
	}

	protected void checkLogin(String u, String p) {
		 if (p.equals(password) && u.equals(user_name)){
             Toast.makeText(this, "Login Succes", Toast.LENGTH_SHORT).show();
             Intent intent = new Intent(FormActivity.this,MainActivity.class);
             startActivity(intent);
             this.finish();
     }
     else{
             Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
     }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form, menu);
		return true;
	}

}
