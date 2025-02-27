package arrays;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"java","java","python","Python"};
		boolean flag=false;
		for(int i=0;i <arr.length;i++)
		{
			for(int j=i+1;j <arr.length;j++)
			{
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					System.out.println("Duplicates in array :"  +arr[i]);
					flag=true;
				}else
				{
					System.out.println("No Duplicates");
				}
			}
		}

	}

}
