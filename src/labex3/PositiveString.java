package labex3;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		if(positive(s)) {
			System.out.println("given string is positive");
		}
		else {
			System.out.println("givenString is Not Positive");
		}
	}

	private static boolean positive(String s) {
		int n=s.length();
		char[] c=new char[n];
		for(int i=0;i<n;i++) {
			c[i]=s.charAt(i);
		}
		Arrays.sort(c);
		for(int i=0;i<n;i++) {
			if(c[i]!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
