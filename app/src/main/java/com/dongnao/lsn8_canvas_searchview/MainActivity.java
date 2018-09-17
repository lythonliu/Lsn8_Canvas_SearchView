package com.dongnao.lsn8_canvas_searchview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends com.lythonliu.LinkActivity {

	@Override
	public String getAppName(){
		return BuildConfig.APP_NAME;
	}

	private MySearchView mySearchView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mySearchView = (MySearchView)findViewById(R.id.sv);
		mySearchView.setController(new Controller1());
		
	}
	
	public void start(View v){
		mySearchView.startAnimation();
	}
	public void reset(View v){
		mySearchView.resetAnimation();
	}

}
