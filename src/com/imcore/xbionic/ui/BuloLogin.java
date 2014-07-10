package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BuloLogin extends ActionBarActivity implements OnClickListener{
	private Button btnBuloLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bulo_level_login);
		getSupportActionBar().hide();
		
		btnBuloLogin = (Button) findViewById(R.id.iv_bulo_login);
		btnBuloLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(this, BuloPingfang.class);
		startActivity(intent);
		
	}
}
