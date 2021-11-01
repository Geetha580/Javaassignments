package lab6;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
	public static void main(String[] args) {
		Integer[] nums=new Integer[] {5,3,6,7,2,9,33};
		System.out.println(secondLarge(nums));
	}

	private static Integer secondLarge(Integer[] nums) {
		ArrayList<Integer> al=new ArrayList<>();
		for(Integer i:nums) {
			al.add(i);
		}
		Collections.sort(al);
		Integer num=al.get(al.size()-2);
		
		return num;
	}

}
