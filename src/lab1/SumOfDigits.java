package lab1;
import java.util.Scanner;
public class SumOfDigits {
	public static int sumOfCubesDigits(int num) {
		int sum=0;
		while(num!=0)
		{
			int digit= num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println("Enter a number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   
		int number= sc.nextInt();
		System.out.println(sumOfCubesDigits(number));
	}
}

