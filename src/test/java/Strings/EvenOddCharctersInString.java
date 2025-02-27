package Strings;

public class EvenOddCharctersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="vijender";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1) {
				System.out.println("Even position character:" + a[i]);
			}else {
				System.out.println("Odd position character:" + a[i]);
			}
				
		}

	}

}
