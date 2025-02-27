package Strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="vijender";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)//string starts from 0 index
		{
			rev=rev+s.charAt(i);
			System.out.println(rev);
			
		}

	}

}
