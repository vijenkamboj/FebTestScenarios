package Strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "vijender";
		HashSet<String> hs = new LinkedHashSet<String>();//linkedhashset is ordered collection
		for (int i = 0; i < s.length(); i++) {
			String s1=String.valueOf(s.charAt(i));
			hs.add(s1);
		
		}
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
