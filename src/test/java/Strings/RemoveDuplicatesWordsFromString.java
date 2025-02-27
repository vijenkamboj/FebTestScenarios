package Strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am vijender vijender";
		String[] s1=s.split("");
		HashSet<String> hs=new LinkedHashSet<String>();
	for(int i=0;i<s1.length;i++)
	{
		hs.add(s1[i]);
	}
Iterator<String> itr=hs.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
