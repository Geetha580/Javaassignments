package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EligibilityOfThePersonToVote {
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(363213,22);
		map.put(132868, 17);
		map.put(325438, 45);
		map.put(877569, 26);
		List<Integer> li=votersList(map);
		System.out.println("eligible members id's for voting");	
		System.out.println(li);
		
	}

	private static List<Integer> votersList(Map<Integer, Integer> map) {
		List<Integer> li=new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>=18) {
				li.add(entry.getKey());
			}
		}
		return li;
	}

}
