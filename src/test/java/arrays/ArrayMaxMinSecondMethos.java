package arrays;

import java.util.Arrays;

public class ArrayMaxMinSecondMethos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 87, 45, 20 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum in an array:" +arr[arr.length-1]);
		System.out.println("Minimum in an array:" +arr[arr.length-5]);
	}

}
