package others;

public class Starpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 4; i++)// for rows
		{
			for (int j = 4; j >=i; j--)
			{ // i=1,j=1
				System.out.print("*");
			}
			System.out.println();
		}
		}
		

}
