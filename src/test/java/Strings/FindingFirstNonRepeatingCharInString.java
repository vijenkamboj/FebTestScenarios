package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindingFirstNonRepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vijender";
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		// linkedhashmap for maintaining insertion order so elements can be accessed in
		// their insertion order

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Entry<Character, Integer> x : map.entrySet()) {
			if (x.getValue() == 1) {
				System.out.println(x.getKey());
				break;
			}
		}
	}

}

//output =v
