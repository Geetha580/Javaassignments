package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {
		SortedList e=new SortedList();
		e.getValues();
			
	}
	public List getValues() {
		HashMap<String,String> h=new HashMap<>();
		h.put("b", "Bottle");
		h.put("c", "cat");
		h.put("a","Apple");
		List<String> li=new ArrayList<>(h.keySet());
		for(String s:li) {
			System.out.println(s);
		}
		return li;
		
	}
		

}
