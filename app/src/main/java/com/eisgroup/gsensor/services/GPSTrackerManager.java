package com.eisgroup.gsensor.services;

import android.content.Context;
import android.content.Intent;

public class GPSTrackerManager {

	public void startService(Context context) {
		context.startService(new Intent(context, GPSTracker.class));
	}

	public void stopService(Context context) {
		context.stopService(new Intent(context, GPSTracker.class));
	}



}
