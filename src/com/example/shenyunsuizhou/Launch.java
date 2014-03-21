package com.example.shenyunsuizhou;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.example.shenyunsuizhou.json.DataManeger;
import com.example.shenyunsuizhou.json.Test_Bean;
import com.example.shenyunsuizhou.json.Test_Model;
import com.example.shenyunsuizhou.json.Y_Exception;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.format.Time;
import android.util.Log;
import android.view.Menu;

public class Launch extends Activity {

	private Timer timer = new Timer();
	private TimerTask task;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch);
		
		
		timeStart();
		
	}

	
	private void timeStart()
	{
		task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				timer.cancel();
				Intent intent = new Intent(Launch.this,HomeActivity.class);
				intent.putExtra("home", "yes");
				startActivity(intent);
				finish();
				
			}
		};
		
		timer.schedule(task, 1000,1000);
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launch, menu);
		return true;
	}

}
