package lab1;
import java.util.*;
public class Power {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		powerOfNum(num);
	}
	public static void powerOfNum(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		if(count==2) {
			System.out.println("power of given number is 2");
		}
		else {
			System.out.println("power of given number is not two");
		}
	}

}
