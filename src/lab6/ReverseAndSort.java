package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReverseAndSort {
	public static void main(String[] args) {
		int[] arr=new int[] {5,9,2,23,6,7};
		getSorted(arr);
	}

	private static void getSorted(int[] arr) {
		List<Character> chars=new ArrayList<Character>();
		String str=" ";
		for(int i=0;i<arr.length;i++) {
			str=arr[i]+str;
		}
		for(char ch:str.toCharArray()) {
			chars.add(ch);
		}
		Collections.sort(chars);
		System.out.println(chars);
	}

}
