package labex3;

import java.util.Scanner;

public class DiffrenceOfConsecutineNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String which contains digits");
		int num=scan.nextInt();
		System.out.println(findingCosecuties(num));
		
	}

	private static int findingCosecuties(int num) {
		String str=String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			char ch1=str.charAt(i+1);
			if(ch!=str.charAt(str.length()-1)) {
				sb.append(Integer.parseInt(ch+"")-Integer.parseInt(ch1+""));
			}
			
		}
		return Integer.parseInt(sb.toString());
	}

}
