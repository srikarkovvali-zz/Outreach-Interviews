package com.outreach.interviews.map.builder;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.outreach.interviews.map.enums.MapModes;
import com.outreach.interviews.map.enums.MapOperations;

public class MapGeoHelper {
	
	public static class GeoBuilder {

		private String address;
		private MapOperations operation;
		private MapModes mode;
		private JsonObject result;

		private final String URL = "https://maps.googleapis.com/maps/api/";
		private CloseableHttpClient httpclient = HttpClients.createDefault();
		
		/**
		 * Set the starting point
		 * @param origin String representing the starting point
		 * @return {@link GeoBuilder}
		 */
		public GeoBuilder setAddress(String address)  {
			this.address = address;
			return this;
		}

		/**
		 * Set the region {@link MapModes}
		 * @param mode Allows for walking, driving, transit, biking
		 * @return {@link GeoBuilder}
		 */
		public GeoBuilder setMapMode(MapModes mode) {
			this.mode = mode;
			return this;
		}
		
		/**
		 * Create the URL to communicate with the Google Maps API
		 * @param type URL to provide to Apache HttpClient
		 * @return {@link GeoBuilder}
		 */
		public GeoBuilder setURL(MapOperations type) {
			if(type.equals(MapOperations.directions))
				throw new UnsupportedOperationException();

			this.operation = type;
			return this;

		}
		
		/**
		 * Perform the HTTP request and retrieve the data from the HttpClient object
		 * @return {@link GeoBuilder}  
		 * @throws UnsupportedOperationException
		 * @throws IOException
		 * @throws IllegalArgumentException
		 */
		public GeoBuilder build() throws UnsupportedOperationException, IOException, IllegalArgumentException {
			String requestURL = this.getURL()  	+ "&address=" + getAddress() 
												+ "&key=" + this.getAPIKey();
			
			if(getMode() != null) {
				requestURL = requestURL + "&mode=" + this.getMode();
			}
			
			HttpGet httpGet = new HttpGet(requestURL);
			
			CloseableHttpResponse response = httpclient.execute(httpGet);
			
			try {
				HttpEntity entity = response.getEntity();
				String result = IOUtils.toString(entity.getContent(), "UTF-8");
				this.result = new JsonParser().parse(result).getAsJsonObject();
			}
			finally {
				response.close();
			}
			
			return this;
		}
		
		/**
		 * Retrieve the geocode matching the provided locaiton
		 * @return List of String containing the steps to get to the destination
		 */
		public JsonObject getGeocode() {
			if(this.operation.equals(MapOperations.geocode) && zeroResults(this.result)) {
				return this.result.get("results").getAsJsonArray().get(0).getAsJsonObject().get("geometry").getAsJsonObject().get("location").getAsJsonObject();
			} else if (!zeroResults(this.result)){
				JsonObject noRes = new JsonObject();
				noRes.addProperty("Number of results", 0);
				return noRes;
			} else {
				throw new IllegalArgumentException("Does not support " + MapOperations.directions.name());
			}
		}
		

		//*************************For Internal Use Only***********************************//
		private final String getURL() {
			return this.URL + this.operation.name() + "/json?";
		}

		private final String getAPIKey() {
			return "AIzaSyD0AXY5m13exK_uX-0MN66XjLP0e2R8YMQ";
		}
		
		private final String getAddress() {
			if(this.address == null)
				throw new IllegalArgumentException("Address cannot be empty");
			
			return this.address.replace(" ", "+");
		}
		
		
		private final String getMode() {
			if(this.mode == null) {
				return null;
			}
			
			return this.mode.name();
		}

		private final boolean zeroResults(JsonObject obj) {
			return !obj.get("status").getAsString().equals("ZERO_RESULTS");
		}

	}
}
