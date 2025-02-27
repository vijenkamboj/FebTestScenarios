package Strings;

import java.util.HashMap;

public class FindingDuplicatesCharInString {

	public static void main(String[] args) {
		String s = "laptop";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
			for (Character x : map.keySet()) {//keyset for loop purpose
				if (map.get(x) > 1) {
					System.out.println(x + ":" +map.get(x));
				}
			}
		}

	}
}
