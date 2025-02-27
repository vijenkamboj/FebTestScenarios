package others;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// keep adding first to second and the next is sum of first and second
		int first = 0;
		int second = 1;
		int n = 10;
		for(int i=1;i<=10;i++)
		{
			int third=first+second;
			first=second;
			second=third;
		System.out.println(first);
			
		}
	}

}
