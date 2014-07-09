package com.imcore.xbionic.ui;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.imcore.xbionic.R;
import com.imcore.xbionic.http.Constant;
import com.imcore.xbionic.http.DataRequest;
import com.imcore.xbionic.http.RequestQueueSingleton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		loginView();
		
	}
	
	private void loginView() {
//		Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//		startActivity(intent);
		
		Intent intent = new Intent(MainActivity.this, WelcomeFirst.class);
		startActivity(intent);
		
	}

	@SuppressWarnings("unused")
	private void doLogin() {
		final String userName = "";
		final String password = "";

		String url = Constant.HOST + "/passport/login";
		DataRequest request = new DataRequest(Request.Method.POST, url,
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						// 解析用户信息的json，保存userid和token

					}
				}, new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub

					}
				}) {
			@Override
			protected Map<String, String> getParams()
					throws AuthFailureError {
				// 在此方法中设置要提交的请求参数
				Map<String,String> params = new HashMap<String, String>();
				params.put("phoneNumber", userName);
				params.put("password", password);
				
				
				return params;
			}
		};
		
		RequestQueueSingleton.getInstance(this).addToRequestQueue(request);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
