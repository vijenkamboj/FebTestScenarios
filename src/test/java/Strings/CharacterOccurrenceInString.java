package Strings;

import java.util.HashMap;

public class CharacterOccurrenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is an object oriented language";
//chracter as occurencr and Integer as value
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}
		}

		for (Character x : map.keySet())// loop so using ketset in hasmap for occurence
		{
			//if(map.get(x)>1) ->if we want the duplicate charc

			System.out.println("Occurence of character:" + x + "=" + map.get(x));
		}
	}
}
