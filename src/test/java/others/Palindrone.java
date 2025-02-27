package others;

public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the reverse of string is same as of original string
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i-- ) 	
		{
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
		
			if(s.equals(rev))
			{
				System.out.println("String is palindrone :" + rev);
			}else {
				System.out.println("String is not paloindrone");
			}

	}

}
