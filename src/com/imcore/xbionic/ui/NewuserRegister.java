package com.imcore.xbionic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.imcore.xbionic.R;

public class NewuserRegister extends ActionBarActivity implements OnClickListener {
	private Button btnTelephoneRegister;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_level_register);
		getSupportActionBar().hide();
		btnTelephoneRegister = (Button) findViewById(R.id.iv_telephone_register);
		
		btnTelephoneRegister.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, TelephoneRegister.class);
		startActivity(intent);
	}
}
