package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class CountWordsOccurenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am learning learning java java program";
		int count=1;
		String[] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		HashMap<String,Integer> map =new HashMap<String,Integer>();
		for(int i=0;i<str.length;i++)
		{
		if(map.containsKey(str[i]))
		{
			map.put(str[i],map.get(str[i])+1);
		}else {
			map.put(str[i],count);
		}
		}
		for(String x :map.keySet())
		{
			System.out.println("Count words: " +  x +  "=" + map.get(x));
		}
	}

}
