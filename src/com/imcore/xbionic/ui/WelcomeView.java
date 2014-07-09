package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class WelcomeView extends Activity {
	private ImageView ImgBackground;

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
		
		if (hasFocus) {
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					
					Intent intent = new Intent(WelcomeView.this,
							MainActivity.class);
					startActivity(intent);
					
					// Intent intent = new Intent(WelcomeView.this,
					// WelcomeFirst.class);
					// startActivity(intent);
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
