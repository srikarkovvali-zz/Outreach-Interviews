package com.outreach.interviews.documentation.questions;

public class Calculate {

	public static void main(String[] args) {
	
		Calculate.callStrings_1(); // What is happening here?
		Calculate.callNumbers_1(); // What is happening here?
	}
	
	public static void callStrings_1() {
		Strings s = new Strings("Billy_Billy_Billy_Billy_Billy"); // What is happening here?
		
		System.out.println(s.a_f("Patrique")); // What is happening here?
		System.out.println(s.a_f("Billy"));
		System.out.println(s.a_f("Bily"));
		
		System.out.println('\n');
		
		System.out.println(s.b_f()); // What is happening here?
		
		System.out.println('\n');
		
		System.out.println(s.c_f()); // What is happening here?
		
		System.out.println('\n');
		
		System.out.println(s.d_f("Billy")); // What is happening here?
		System.out.println(s.d_f("billy"));
		
		System.out.println('\n');
		
		System.out.println(s.e_f("Billy")); // What is happening here?
		System.out.println(s.e_f("billy"));
		
		System.out.println('\n');
	}
	
	public static void callNumbers_1() {
		System.out.println(Numbers.x(1, 2)); // What is happening here? 
		System.out.println(Numbers.x(4, 2)); 
		System.out.println('\n');
		
		System.out.println(Numbers.y(1, 2)); // What is happening here? 
		System.out.println(Numbers.y(4, 2)); 
		System.out.println('\n');
		
		System.out.println(Numbers.z(1, 2)); // What is happening here?
		System.out.println(Numbers.z(2, 2));
		System.out.println('\n');
		
		System.out.println(Numbers.v_1(new Integer[] {1,2,3,4,5,6,7,8,9,10})); // What is happening here?
		System.out.println('\n');
		
		System.out.println(Numbers.v_2(new Integer[] {1,2,3,4,5,6,7,8,9,10})); // What is happening here?
		System.out.println('\n');
		
		System.out.println(Numbers.v_3(new Integer[] {1,2,3,4,5,6,7,8,9,10})); // What is happening here?
		System.out.println('\n');
	}
	
}