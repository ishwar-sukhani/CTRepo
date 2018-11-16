package hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceInString {

	static String countOccurrence(String str) {
		
		String returnString = "";
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		char arr[] = str.toCharArray();
		for(char ch : arr){
			if(map.containsKey(ch)){
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
			else{
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.print(key +" "+ value);
		}
		System.out.println(map);
		return "";
	}
	
	public static void main(String[] args) {
		String s = "occurrences";
		String output = countOccurrence(s);
		System.out.println(output);
	}
}
