package Strings;

public class ReverseFirstNotTheSecndString {
	
	public static void main(String[] args)
	{
		String s="vijender kumar";
		String s1 = s.split(" ")[0];
		String s2=s.split(" ")[1];
		System.out.println(s1);
		
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
					
		{
			rev = rev + s1.charAt(i);
			
		}
		System.out.println(rev);
		String s3=rev.concat(s2);
		System.out.println(s3);
	}
	

}
