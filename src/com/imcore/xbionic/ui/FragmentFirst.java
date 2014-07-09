package com.imcore.xbionic.ui;

import com.imcore.xbionic.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentFirst extends Fragment {
	private ImageView ivImage;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.view_image_item, null);
		ivImage = (ImageView) view.findViewById(R.id.iv_welcome_image);
		ivImage.setImageResource(R.drawable.welcompage1);
		return view;
	}
}
