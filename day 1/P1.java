package com.sangamone;

public class N1 {
	public static void reverse1(String word1) {
		String s1=word1;
		String temp1="";
		int len1=s1.length();
		for(int i=0;i<len1;i++) {
			temp1=s1.substring(len1-(i+1),len1-i);
			System.out.print(temp1);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse1("Kuthyar");
		reverse1("Yuktha");
		
		
			
		
	}

}
