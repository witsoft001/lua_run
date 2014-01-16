package com.hanxi.luarun;

import android.os.Bundle;

public class DocActivity extends MyWebkitActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SysApplication.getInstance().addActivity(this); 

		DOC_URL = "file:///android_asset/www.lua.org/index.html";
        mWebView.loadUrl(DOC_URL);
	}
}