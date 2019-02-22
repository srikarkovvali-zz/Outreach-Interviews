package com.outreach.interviews.documentation.questions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumbersTest {
	
	@Test
	public void test_x() {
		assertTrue(Numbers.x(1, 2)); // What is happening here? 
		assertTrue(!Numbers.x(4, 2)); 		
	}
	
	@Test
	public void test_y() {
		assertTrue(!Numbers.y(1, 2)); // What is happening here? 
		assertTrue(Numbers.y(4, 2));
	}

	@Test
	public void test_z() {
		assertTrue(!Numbers.z(1, 2)); // What is happening here?
		assertTrue(Numbers.z(2, 2));
	}

	@Test
	public void test_v1() {
		assertTrue( 5.0 == Numbers.v_1(new Integer[] {1,2,3,4,5,6,7,8,9,10})); // What is happening here?
	}

	@Test
	public void test_v2() {
		assertTrue(1 == Numbers.v_2(new Integer[] {1,2,3,4,5,6,7,8,9,10})); // What is happening here?
	}

	@Test
	public void test_v3() {
		assertTrue(10 == Numbers.v_3(new Integer[] {1,2,3,4,5,6,7,8,9,10})); // What is happening here?

	}
}
