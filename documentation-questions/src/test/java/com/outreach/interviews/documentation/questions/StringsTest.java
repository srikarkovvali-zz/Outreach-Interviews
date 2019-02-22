package com.outreach.interviews.documentation.questions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringsTest {
	private static Strings s; 
	
	@BeforeClass
	public static void static_setup() {
		s = new Strings("Billy_Billy_Billy_Billy_Billy");
	}
	
	@Test
	public void testa_f() {
		assertTrue(!s.a_f("Patrique"));
		assertTrue(s.a_f("Billy"));
		assertTrue(!s.a_f("Bily"));
	}

	@Test
	public void testb_f() {
		assertTrue(!s.b_f());
	}
	
	@Test
	public void testc_f() {
		assertTrue(!s.c_f());
	}
	
	@Test
	public void testd_f() {
		assertTrue(5 == s.d_f("Billy")); // What is happening here?
		assertTrue(0 == s.d_f("billy"));
	}
	
	@Test
	public void teste_f() {
		assertTrue(5 == s.e_f("Billy")); // What is happening here?
		assertTrue(5 == s.e_f("billy"));
	}
}