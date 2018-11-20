package com.outreach.interviews;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.google.gson.JsonObject;
import com.outreach.interviews.map.builder.MapGeoHelper;
import com.outreach.interviews.map.enums.MapOperations;

public class TestMapGeoHelper {

	/**
	 * Test to ensure whether or not a connection to the API can be made
	 * @throws UnsupportedOperationException
	 * @throws IOException
	 */
	@Test
	public void testMapRoutesHelperApiKey1() throws UnsupportedOperationException, IOException {
		new MapGeoHelper.GeoBuilder().setAddress("Sudbury").setURL(MapOperations.geocode).build();
	}

	/**
	 * Test to ensure the API properly returns the longitude and latitude
	 * @throws UnsupportedOperationException
	 * @throws IOException
	 */
	@Test
	public void testMapRoutesHelperApiKey2() throws UnsupportedOperationException, IOException {
		JsonObject geo = new MapGeoHelper.GeoBuilder().setAddress("Sudbury").setURL(MapOperations.geocode).build().getGeocode();

		assertNotNull(geo);
		assertTrue(geo.has("lng") && geo.has("lat"));
	}

	/**
	 * Test that fails due to the wrong operation mode being passed to the GeoBuilder
	 * @throws UnsupportedOperationException
	 * @throws IOException
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testMapRoutesHelperApiKey3() throws UnsupportedOperationException, IOException {
		JsonObject geo = new MapGeoHelper.GeoBuilder().setAddress("Sudbury").setURL(MapOperations.directions).build().getGeocode();

		assertNotNull(geo);
	}

	/**
	 * Test that fails due to the lack of address parameter being passed to the GeoBuilder
	 * @throws UnsupportedOperationException
	 * @throws IOException
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testMapRoutesHelperApiKey4() throws UnsupportedOperationException, IOException {
		JsonObject geo = new MapGeoHelper.GeoBuilder().setURL(MapOperations.geocode).build().getGeocode();

		assertNotNull(geo);
	}
	
	/**
	 * Test that fails due to illegal characters being passed in to the google API as a parameter
	 * @throws UnsupportedOperationException
	 * @throws IOException
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testMapRoutesHelperApiKey6() throws UnsupportedOperationException, IOException {
		JsonObject geo = new MapGeoHelper.GeoBuilder().setAddress("{}{}}{}{}{}").setURL(MapOperations.geocode).build().getGeocode();

		assertNotNull(geo);
	}

	/**
	 * Test ensuring that on return of 0 search results the user is notified rather than an unhelpful error being thrown
	 * @throws UnsupportedOperationException
	 * @throws IOException
	 */
	@Test
	public void testMapRoutesHelperApiKey5() throws UnsupportedOperationException, IOException {
		JsonObject geo = new MapGeoHelper.GeoBuilder().setAddress("4d5t5t5dfgdsrtrdrx").setURL(MapOperations.geocode).build().getGeocode();
		assertNotNull(geo);
		assertTrue(geo.has("Number of results"));
	}
}
