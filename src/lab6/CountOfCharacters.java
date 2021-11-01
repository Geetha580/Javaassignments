package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfCharacters {
	public static void main(String[] args) {
		char[] a= {'g','s','r','f','g','r'};
		countOfChar(a);
	}

	private static void countOfChar(char[] a) {
		
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<a.length;i++){
			char put=a[i];
			if(m.containsKey(put)) {
				m.put(put,m.get(put)+1);
				//System.out.println(a[i]+" "+count);
			}
			else {
				m.put(put, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}

}
