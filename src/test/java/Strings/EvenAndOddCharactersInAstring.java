package Strings;

public class EvenAndOddCharactersInAstring {
	
	public static void main(String[] args)
	{
		String s="vijender";
		char[] c = s.toCharArray();//to perform some operation on string convert to chararray as string are immutable
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even character:" +c[i]);
			}else
			{
				System.out.println("odd character:" +c[i]);
			}
		}
	}
}
