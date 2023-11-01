package com.sangamone.r2;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Wordgame {

	public static void main(String[] args) throws FileNotFoundException { 
		// TODO Auto-generated method stub
		List<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		List<List<String>>list3=new ArrayList<>();
		File f1=new File("words.txt");
		Scanner sc1=new Scanner(f1);
		String temp1="";
		String word1="";
		String s1="";
		while(sc1.hasNextLine()) {
			temp1=sc1.nextLine();
			list1.add(temp1);
		}
		int len1=list1.size();
		
		list2.clear();
		for(int i=0;i<len1;i++) {
			word1=list1.get(i);
			s1=word1.substring(0,1);
			if(s1.equals("c")) {
				list2.add(word1);
				}
		}
		System.out.println(list2);
		list3.add(list2);
		
		list2.clear();
		for(int i=0;i<len1;i++) {
			word1=list1.get(i);
			s1=word1.substring(0,1);
			if(s1.equals("d")) {
				list2.add(word1);
				}
		}
		System.out.println(list2);
		list3.add(list2);
		System.out.println(list3);
		

	}

}