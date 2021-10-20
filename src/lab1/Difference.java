package lab1;

import java.util.Scanner;

public class Difference {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 System.out.println(difference(num));
		 
	}

	private static int difference(int num) {
		int s1=0,s2=0,diff=0,squares=0;
		for(int i=0;i<=num;i++){
			s1=s1+(i*i);
			s2=s1+i;
		}
		squares=s2*s2;
		diff=squares-s1;
		return diff;
	}

}
