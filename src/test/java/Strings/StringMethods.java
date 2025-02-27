package Strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Rains have started here swiftly";
		String date="27/02/25";
		String s1="  Hello world  ";
		String s2="Hello_word_of_selenium";
		
		System.out.println(s.indexOf("s"));
		//overload of indexof method
		System.out.println(s.indexOf("s",s.indexOf(s)+7));//second occurenece of s starts from index we need to provide
		System.out.println(s.indexOf("s",s.indexOf(s)+13));//third occurenece of s starts from index we need to provide

		System.out.println(s.indexOf("have"));
		System.out.println(s.indexOf("hello"));//hello not present so it will give -1 as output
		System.out.println(date.replace("/","-"));
		System.out.println(s1.trim());
		
		String s3[]=s2.split("_");// return type of split is an array
		for(int i=0;i<s3.length;i++)
		{
			System.out.println(s3[i]);
		}
		
		
		String x="Hello";
		String y="world";
		int a =100;
		int b =200;
		System.out.println(x+y);//compiler starts compliling from left to the right
		System.out.println(x+y+a+b);//strings can be concatenated with any data type eg. int
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y);
		

	}

}
