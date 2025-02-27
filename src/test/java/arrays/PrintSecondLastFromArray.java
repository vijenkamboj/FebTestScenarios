package arrays;

import java.util.Arrays;

public class PrintSecondLastFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,56,3,4,89,10};
		Arrays.sort(arr);//ascending order
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);
		
		

	}

}
