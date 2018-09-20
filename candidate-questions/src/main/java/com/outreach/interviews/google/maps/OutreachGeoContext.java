package com.outreach.interviews.google.maps;

import com.google.maps.GaeRequestHandler;
import com.google.maps.GeoApiContext;

public class OutreachGeoContext 
{
	private final GeoApiContext context;

	public OutreachGeoContext() {
		this.context = new GeoApiContext.Builder(new GaeRequestHandler.Builder())
				.apiKey("AIzaSyCm7Ch5uGRBIrsUkSHNBN8-W-dV7thmjXU")
				.build();
	}

	public GeoApiContext getGeoApiContext() {
		return this.context;
	}

}
