package arrays;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class SortPrintAndRemoveFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 13, 4, 7, 9 };
		Arrays.sort(arr);// ascending order
		System.out.println(Arrays.toString(arr));

		int[] result = ArrayUtils.remove(arr, 2);
		System.out.println(Arrays.toString(result));

	}

}
