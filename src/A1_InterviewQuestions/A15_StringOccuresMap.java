package A1_InterviewQuestions;

import java.util.Map;
import java.util.TreeMap;

public class A15_StringOccuresMap {
	public static void main(String[] args) {
		String a = "vcentry";
		char str[]= a.toCharArray();
		Map<Character,Integer>map = new TreeMap<Character,Integer>();
		for(int i = 0;i<str.length;i++) {
			Integer inte=map.get(str[i]);
			if(inte==null) {
				map.put(str[i], 1);
			}
			else {
				map.put(str[i], inte+1);
			}
		}
		System.out.println(map);
	}
}

		    
		    
		
	
	


