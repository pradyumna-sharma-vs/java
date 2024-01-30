package com.sangamone;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class University {
	public static ArrayList<String>loadData(String fname)throws Exception
	{
		ArrayList<String> list1 = new ArrayList<>();
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNext())
		{
			list1.add(sc1.nextLine());
		}
		return list1;
	}

	public static void main(String[] args)throws Exception {
		ArrayList<String> list2 = new ArrayList<>();
		list2 = loadData("univIndia.txt");
		System.out.println(list2);
	}

}
