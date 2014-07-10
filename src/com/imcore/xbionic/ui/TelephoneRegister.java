package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TelephoneRegister extends ActionBarActivity implements OnClickListener{
	private Button btnTeleRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_tele_register);
		getSupportActionBar().hide();
		
		btnTeleRegister = (Button) findViewById(R.id.btn_tele_register);
		btnTeleRegister.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, TeleRegister.class);
		startActivity(intent);
	}
}
