package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N2 {

	public static void main(String[] args) throws IOException {
		File f1=new File("names.txt");
		FileWriter f2=new FileWriter("names_out.txt");
		Scanner sc=new Scanner(f1);
		String info1="";
		List<String>names1=new ArrayList<>();
		while(sc.hasNextLine())
		{
			info1=sc.nextLine();
			names1.add(info1);
			
		}
		System.out.println(names1);
		for(int i=0;i<names1.size();i++) {
			String output=reverse(names1.get(i));
			System.out.println(output);
			f2.write(output);
			f2.write("\n");
		}
		
		f2.close();
	}
	public static String reverse(String word1) {
		String s1=word1;
		String temp1="";
		String output1="";
		int len1=s1.length();
		for(int i=0;i<len1;i++) {
			temp1=s1.substring(len1-(i+1),len1-i);
			output1=output1+(temp1);
		}
		System.out.println();
		return output1;
	}
	
	

}
