package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class WelcomeView extends Activity {
	private ImageView ImgBackground;
	private SharedPreferences preferences;
	private Editor editor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_welcome);
		ImgBackground = (ImageView) findViewById(R.id.iv_bg);
		transition();
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		preferences = getSharedPreferences("count", Context.MODE_PRIVATE);
		
		if (hasFocus) {
			new Handler().postDelayed(new Runnable() {
				int count = preferences.getInt("count", 0);
				@Override
				public void run() {
					if(count == 0) {
						
						Intent intent = new Intent(WelcomeView.this,
								 WelcomeFirst.class);
								 startActivity(intent);
						
						editor = preferences.edit();
						editor.putInt("count", ++count);
						editor.commit();
					} else {
						Intent intent = new Intent(WelcomeView.this,
								MainActivity.class);
						finish();
						startActivity(intent);
					}
					
					
					
				}
			}, 2500);
			
		}
		
	}

	private void transition() {
		Animation animation = AnimationUtils.loadAnimation(this,
				R.anim.shanping_animation);
		ImgBackground.startAnimation(animation);
	}

}
