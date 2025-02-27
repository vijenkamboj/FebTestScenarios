package Strings;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "laptop";
		String s2 = "Dell";

		String s3 = s1.concat(s2);
		System.out.println(s3);
		s1 = s3.substring(6, s3.length());
		System.out.println(s1);
		s2 = s3.substring(0, 6);
		System.out.println(s2);

	}

}
