import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<String> perm4(String word4) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word4;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}
		

		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}
		return list4;
	}

	public static List<String> perm3(String word3) {
		String input1 = word3;
		List<String> permutation_words = new ArrayList<>();
		String s1 = input1.substring(0, 1);
		String s2 = input1.substring(1, 2);
		String s3 = input1.substring(2, 3);
		permutation_words.add(s1 + s2 + s3);
		permutation_words.add(s1 + s3 + s2);
		permutation_words.add(s2 + s1 + s3);
		permutation_words.add(s2 + s3 + s1);
		permutation_words.add(s3 + s1 + s2);
		permutation_words.add(s3 + s2 + s1);
		return permutation_words;
	}
    public static void main(String[]args) throws IOException
	{
		String input1="";
		String s1,s2;
		List<String> result = new ArrayList<>();
		FileOutputStream fileWriter = new FileOutputStream("output.txt");
		PrintWriter pw =new PrintWriter(fileWriter);
		input1 = "EAT";
		result = perm3(input1);
		pw.println("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n");
		
		input1 = "FAST";
		result = perm4(input1);
		pw.println("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n");
    }
}