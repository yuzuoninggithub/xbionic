package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class SinaLogin extends ActionBarActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sina_level_login);
		getSupportActionBar().hide();
	}

}
