package lab6;

import java.util.HashMap;
import java.util.Set;

public class Medals {
	public static void main(String[] args) {
		HashMap<String,Integer> stu=new HashMap<String,Integer>();
		Medals m=new Medals();
		stu.put("L252", 85);
		stu.put("L467",90);
		stu.put("L368",80);
		stu.put("L336",70);
		System.out.println(m.getStudent(stu));
	}
	public HashMap<String,String> getStudent(HashMap<String,Integer> stu){
		HashMap<String,String> medal=new HashMap<>();
		Set<String> s=stu.keySet();
		for(String st:s)
        {
               Integer marks = stu.get(st);
               if(marks>=90)
               {
                     medal.put(st,"Gold");
               }
               else if(marks >=80)
               {
                     medal.put(st,"Silver");
               }
               else if(marks>=70)
                 	{
                         medal.put(st,"Bronze");
                 }
            }
           
		return medal;
		
	}

}
