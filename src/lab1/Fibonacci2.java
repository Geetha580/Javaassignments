package lab1;

import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number ");
		int num= scan.nextInt();
		if(fibbonacci(num)==0)
			System.out.println("Invalid");
		else {
			System.out.println(fibbonacci(num));
		}
	}

	private static int fibbonacci(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return 0;
		}
		if(num<=2) {
			return 1;
		}
		return fibbonacci(num-1)+fibbonacci(num-2);
	}

}
