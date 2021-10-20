package lab1;

import java.util.Scanner;

public class SumNum {
	public static void main(String[] args) {
		System.out.println("enter the value for n");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSum(n);
	}
	public static void calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0&&i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
