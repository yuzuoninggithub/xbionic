package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class BuyShow extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_buy_show);
		getSupportActionBar().hide();
	}
}