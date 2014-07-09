package com.imcore.xbionic.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpClientStack;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.ImageLoader;

/**
 * Volley组件单例
 * 
 * @author Li Bin
 */
public class RequestQueueSingleton {
	private static RequestQueueSingleton mInstance;

	private Context mContext;
	private RequestQueue mRequestQueue;
	private ImageLoader mImageLoader;

	// 私有构造函数，初始化请求队列
	private RequestQueueSingleton(Context context) {
		mContext = context.getApplicationContext();
		setUpRequestQueue();
		setUpImageLoader();
	}

	private void setUpRequestQueue() {
		Cache cache = new DiskBasedCache(mContext.getCacheDir(), 1024 * 1024);

		HttpStack stack = null;
		String userAgent = "volley/0";
		try {
			String packageName = mContext.getPackageName();
			PackageInfo info = mContext.getPackageManager().getPackageInfo(
					packageName, 0);
			userAgent = packageName + "/" + info.versionCode;
		} catch (NameNotFoundException e) {
		}
		if (Build.VERSION.SDK_INT >= 9) {
			stack = new HurlStack();
		} else {
			stack = new HttpClientStack(
					AndroidHttpClient.newInstance(userAgent));
		}

		Network network = new BasicNetwork(stack);
		mRequestQueue = new RequestQueue(cache, network);
		// mRequestQueue = Volley.newRequestQueue(context)
		mRequestQueue.start();
	}

	private void setUpImageLoader() {
		mImageLoader = new ImageLoader(mRequestQueue, new LruImageCache(
				mContext));
	}

	/**
	 * 获得单件实例,确保请求队列，图片加载器对象都具有全局唯一实例
	 * 
	 * @param context
	 * @return
	 */
	public synchronized static RequestQueueSingleton getInstance(Context context) {
		if (mInstance == null) {
			mInstance = new RequestQueueSingleton(context);
		}
		return mInstance;
	}

	public RequestQueue getRequestQueue() {
		return mRequestQueue;
	}

	public ImageLoader getImageLoader() {
		return mImageLoader;
	}

	public void addToRequestQueue(Request<?> request) {
		mRequestQueue.add(request);
	}

	public void stopRequestQueue() {
		mRequestQueue.stop();
	}
}
