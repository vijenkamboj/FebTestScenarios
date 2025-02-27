package Strings;

public class StringReversePgm {
	
	public static void RemoveDuplicates(String str) {
	
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}
		}
		
	    public static void main(String args[])  {
	    	String Str = "vijender";
	    	RemoveDuplicates(Str);
	    	
	    }
}

