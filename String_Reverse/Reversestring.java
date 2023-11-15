package com.sangamone;

public class Reversestring {
	public static String reverse1(String word1) {
		String name1=word1;
		String name2="";
		String s1="";
		int len1=name1.length();
		for(int i=0;i<len1;i++) {
			s1=name1.substring(len1-(i+1),len1-i);
			name2=name2+s1;
		}
		return name2;
	}


}
