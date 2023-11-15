package com.sangamone;
import com.sangamone.Reversestring;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) throws FileNotFoundException {
		Reversestring rs1=new Reversestring();
		File f1=new File("names.txt");
		Scanner sc1=new Scanner(f1);
		String temp,result;
		for(int i=0;i<3;i++) {
			temp=sc1.nextLine();
			result=rs1.reverse1(temp);
			System.out.println(result);
		}
		}

}