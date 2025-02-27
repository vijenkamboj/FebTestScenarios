package others;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		//5*4*3*2*1 ->n*(n-1)
		int fact=1;
		for(int i=1;i<=n;i++)//1,2,3,4,5
		{
			fact=fact*i;
			//fact=1*1=1
			//fact=1*2=2
			//fact=2*3=6
			System.out.println(fact);
		}

	}

}
