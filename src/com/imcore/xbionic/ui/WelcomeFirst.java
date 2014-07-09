package com.imcore.xbionic.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.imcore.xbionic.R;

public class WelcomeFirst extends ActionBarActivity {
	private ViewAdapter mViewAdatper;
	private ViewPager mViewPager;
	ImageView ivSpot01, ivSpot02, ivSpot03;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_image_item);
		ivSpot01 = (ImageView) findViewById(R.id.spot01);
		ivSpot02 = (ImageView) findViewById(R.id.spot02);
		ivSpot03 = (ImageView) findViewById(R.id.spot03);

		mViewPager = (ViewPager) findViewById(R.id.view_page);
		mViewAdatper = new ViewAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mViewAdatper);
		mViewPager.setOnPageChangeListener(mOnPageChangeListener);
	}
	
	private OnPageChangeListener mOnPageChangeListener = new OnPageChangeListener() {

		@Override
		public void onPageSelected(int arg0) {
			if (arg0 == 0) {
				ivSpot01.setImageResource(R.drawable.yes);
				ivSpot02.setImageResource(R.drawable.no);
				ivSpot03.setImageResource(R.drawable.no);
			}
			if (arg0 == 1) {
				ivSpot01.setImageResource(R.drawable.no);
				ivSpot02.setImageResource(R.drawable.yes);
				ivSpot03.setImageResource(R.drawable.no);
			}
			if (arg0 == 2) {
				ivSpot01.setImageResource(R.drawable.no);
				ivSpot02.setImageResource(R.drawable.no);
				ivSpot03.setImageResource(R.drawable.yes);
			}

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub

		}
	};


	private class ViewAdapter extends FragmentStatePagerAdapter {

		public ViewAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int arg0) {

			Fragment ft = null;
			switch (arg0) {
			case 0:
				ft = new FragmentFirst();
				break;
			case 1:
				ft = new FragmentSecond();
				break;
			case 2:
				ft = new FragmentThird();
				break;

			}

			return ft;
		}

		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 3;
		}

	}
}
