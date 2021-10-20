package lab1;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args){
		int flag;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);		
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		for(int i=2;i<n;i++){
			flag=0;
			for(int j=2;j<i;j++){
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
		
	}
}
