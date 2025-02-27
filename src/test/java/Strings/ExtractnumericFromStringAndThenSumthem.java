package Strings;

public class ExtractnumericFromStringAndThenSumthem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "9Password$123#";
		String s1 = s.replaceAll("[0-9]", "");//inko chod ke sabko 0 kar do
		System.out.println(s1);
		String s2 = s.replaceAll("[^0-9]", "");
		System.out.println(s2);
		String s3 = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s3);
		String s4= s.replaceAll("[A-Za-z0-9]", "");
		System.out.println(s4);
		int sum = 0;
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			sum = sum + Integer.parseInt("" + c);
			System.out.println(sum);
		}

	}
}
