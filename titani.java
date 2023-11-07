package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Titanic {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f1=new File("titanic.csv");
		List<String> names=new ArrayList<>();
		List<Integer> age=new ArrayList<>();
		List<String> sex=new ArrayList<>();
		Scanner sc=new Scanner(f1);
		String info1;
		String[] list1;
		info1=sc.nextLine();
		System.out.println(info1);
		while(sc.hasNextLine()) {
			list1=sc.nextLine().split(",");
			names.add(list1[4]);
			sex.add(list1[5]);
			age.add(Integer.parseInt(list1[6]));
		}
		int len1=names.size();
		System.out.println(age);
		for(int i=0;i<len1;i++) {
			if(age.get(i)<30) {
				System.out.println(names.get(i));
			}
		}
	}
}
