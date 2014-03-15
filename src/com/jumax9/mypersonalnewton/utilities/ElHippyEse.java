package com.jumax9.mypersonalnewton.utilities;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;

public class ElHippyEse {
	
	public static float altitude(Context c) {
		// Gets altitude over sea level
		float altitud;
		try {
			LocationManager locationManager = (LocationManager) c.getSystemService(Context.LOCATION_SERVICE);
			Criteria criteria = new Criteria();
			String bestProvider = locationManager.getBestProvider(criteria, false);
			Location location = locationManager.getLastKnownLocation(bestProvider);
			altitud = (float) location.getAltitude();
		} catch (Exception e) {
			altitud = 1;
		}
		return altitud;
	}
	
	public static double[] myPosition(Context c) {
		// returns longitude and latitude
		double longitude, latitude;
		try {
			LocationManager locationManager = (LocationManager) c.getSystemService(Context.LOCATION_SERVICE);
			Criteria criteria = new Criteria();
			String bestProvider = locationManager.getBestProvider(criteria, false);
			Location location = locationManager.getLastKnownLocation(bestProvider);
			longitude = location.getLongitude();
			latitude = location.getLatitude();
		} catch (Exception e) {
			longitude = 1;
			latitude = 1;
		}
		return new double[] {longitude,latitude};
	}
	
	public static void refrescar() {
		
	}

}