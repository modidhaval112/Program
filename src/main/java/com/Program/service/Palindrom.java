package com.Program.service;

public class Palindrom {

	public static void main(String[] args) {
		String s = "abba";
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt((s.length()-1)-i)) {
				System.out.println("String is not palindrom!");
				return;
			}
		}
		
		System.out.println("String is Palindrom!");
	}

}
