package com.outreach.interviews.documentation.questions;

public class Numbers {
	
	public static Boolean x(int a , int b) {
		if (a < b)
			return true;
		else
			return false;
	}
	
	public static Boolean y(int a, int b) {
		if(a > b)
			return true;
		else
			return false;
	}
	
	public static Boolean z(int a, int b) {
		if(a == b)
			return true;
		else
			return false;
	}
	
	public static Double v_1(Integer ...a) {
		int r = 0;
		for(int i = 0; i < a.length; i++) {
			r += a[i];
		}
		return (double) (r/a.length);
	}
	
	public static Integer v_2(Integer ...a) {
		int r = a[0];
		for(int i = 0; i < a.length; i++) {
			if(r > a[i]) {
				r = a[i];
			}
		}
		return r;
	}
	
	public static Integer v_3(Integer ...a) {
		int r = a[0];
		for(int i = 0; i < a.length; i++) {
			if(r < a[i]) {
				r = a[i];
			}
		}
		return r;
	}
}
