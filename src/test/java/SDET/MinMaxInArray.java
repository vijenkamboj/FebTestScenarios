package SDET;

import java.util.Arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,8,90,3454,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Array max value:" +arr[arr.length-1]);
		System.out.println("Array min value:" +arr[arr.length-4]);

	}

}
