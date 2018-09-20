package com.outreach.interviews;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.joda.time.ReadableInstant;
import org.junit.BeforeClass;
import org.junit.Test;

import com.outreach.interviews.google.maps.DirectionsRequest;
import com.outreach.interviews.google.maps.OutreachGeoContext;

public class DirectionsRequestTest {
	
	private static OutreachGeoContext outreachGeoContext;
	
	@BeforeClass
	public static void init() {
		outreachGeoContext = new OutreachGeoContext();
	}
	
	@Test
	public void testGetTime() {
		assertNotNull(DirectionsRequest.getTime());
		assertTrue(DirectionsRequest.getTime() instanceof ReadableInstant);
	}
	
	@Test
	public void testSimpleDirections() throws Exception {
		DirectionsRequest d = new DirectionsRequest(outreachGeoContext);
		d.getDirections();
	}

}
