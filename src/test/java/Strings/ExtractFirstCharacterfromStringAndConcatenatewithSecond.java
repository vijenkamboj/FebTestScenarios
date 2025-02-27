package Strings;

public class ExtractFirstCharacterfromStringAndConcatenatewithSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Rahul Sharma";
		char c =s.charAt(0);
		String s1=String.valueOf(c);
		System.out.println(s1);
		
		String s2=s.substring(6,s.length());
				System.out.println(s2);
		
		String s3=s1.concat(s2);
		System.out.println(s3);

	}

}
