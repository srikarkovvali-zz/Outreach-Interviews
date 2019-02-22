package com.outreach.interviews.documentation.questions;

public class Strings 
{
	private String a;
	
	public Strings(String a) {
		this.a = a;
	}
	
	public Boolean a_f(String b) {
		return this.a.contains(b);
	}
	
	public Boolean b_f() {
		return this.a.isBlank();
	}
	
	public Boolean c_f() {
		return this.a.isEmpty();
	}
	
	public Integer d_f(String b) {
		Integer last = 0;
		Integer count = 0;
		
		while(last != -1) {
			last = this.a.indexOf(b, last);
			
			if(last != -1) {
				count++;
				last += b.length();
			}
		}
		
		return count;
	}
	
	public Integer e_f(String b) {
		Integer last = 0;
		Integer count = 0;
		
		while(last != -1) {
			last = this.a.toLowerCase().indexOf(b.toLowerCase(), last);
			
			if(last != -1) {
				count++;
				last += b.length();
			}
		}
		
		return count;
	}
}
