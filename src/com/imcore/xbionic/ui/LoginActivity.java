package com.imcore.xbionic.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.imcore.xbionic.R;

public class LoginActivity extends Activity implements OnClickListener {
	private ImageView ivHelp1, ivServer1;

	private Button ivTencentLogin, ivSinaLogin, ivBuloLoing, ivNewUser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_level_login);

		ivSinaLogin = (Button) findViewById(R.id.iv_login_sina);
		ivTencentLogin = (Button) findViewById(R.id.iv_login_tencent);
		ivBuloLoing = (Button) findViewById(R.id.iv_login_bulo);
		ivNewUser = (Button) findViewById(R.id.iv_login_newuser);
		ivHelp1 = (ImageView) findViewById(R.id.iv_help1);
		ivServer1 = (ImageView) findViewById(R.id.iv_server1);

		ivSinaLogin.setOnClickListener(this);
		ivTencentLogin.setOnClickListener(this);
		ivBuloLoing.setOnClickListener(this);
		ivNewUser.setOnClickListener(this);
		ivHelp1.setOnClickListener(this);
		ivServer1.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_login_sina:
			Intent intent = new Intent(LoginActivity.this, SinaLogin.class);
			startActivity(intent);
			break;
		case R.id.iv_login_tencent:
			Intent intent1 = new Intent(LoginActivity.this, QQLogin.class);
			startActivity(intent1);
			break;
		case R.id.iv_login_bulo:
			Intent intent2 = new Intent(LoginActivity.this, BuloLogin.class);
			startActivity(intent2);
			break;
		case R.id.iv_login_newuser:
			Intent intent3 = new Intent(LoginActivity.this,
					NewuserRegister.class);
			startActivity(intent3);
			break;
		case R.id.iv_help1:

			break;
		case R.id.iv_server1:

			break;
		}

	}

}
