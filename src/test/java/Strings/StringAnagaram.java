package Strings;

import java.util.Arrays;

public class StringAnagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * two strings are considered anagrams if they have the same characters with the
		 * same frequency, but the order of the characters is different. For example,
		 * “listen” and “silent” are anagrams because you can rearrange the letters in
		 * one to form the other.
		 */
		String s1="silent";
		String s2 ="Listen";
		//for doing operations on string convert them to chararray
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		if(arr1.equals(arr2))
		{
			System.out.println("Strings are anagaram");
		}else
		{
			System.out.println("Strings are not anagaram");
		}
	}
      
}
