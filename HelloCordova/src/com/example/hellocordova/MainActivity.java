package com.example.hellocordova;
import org.apache.cordova.*;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends  DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

	
}
