package com.imcore.xbionic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.imcore.xbionic.R;

public class BuloPingfang extends ActionBarActivity implements OnClickListener {
	private Button btnBuy, btnList, btnStory, btnActivity, btnIntroduce;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_bulo_pingfang);
		getSupportActionBar().hide();

		btnBuy = (Button) findViewById(R.id.btn_buy);
		btnList = (Button) findViewById(R.id.btn_list);
		btnStory = (Button) findViewById(R.id.btn_story);
		btnActivity = (Button) findViewById(R.id.btn_activity);
		btnIntroduce = (Button) findViewById(R.id.btn_introduce);

		btnList.setOnClickListener(this);
		btnBuy.setOnClickListener(this);
		btnStory.setOnClickListener(this);
		btnActivity.setOnClickListener(this);
		btnIntroduce.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_list:

			break;
		case R.id.btn_buy:
			Intent intent2 = new Intent(this, BuyShow.class);
			startActivity(intent2);
			break;
		case R.id.btn_story:

			break;
		case R.id.btn_activity:

			break;
		case R.id.btn_introduce:

			break;
		}

	}
}
