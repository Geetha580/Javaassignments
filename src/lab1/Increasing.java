package lab1;

import java.util.Scanner;

public class Increasing {
	public static void main(String args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		increasing(num);
			
		}
	

	private static void increasing(int num) {
		boolean increasing=true;
		while(num>0) {
			int d1=num%10;
			num=num/10;
			int d2=num%10;
			if(d2>d1) {
				increasing=false;
				break;
			}
			
		}
		if(increasing) {
			System.out.println("the number is increasing number");
		}
		else {
			System.out.println("number is not increasing number");
		}
	}
}
