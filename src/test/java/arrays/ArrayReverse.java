package arrays;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,13,4,7,9};
		ArrayUtils.reverse(arr);
		System.out.println(Arrays.toString(arr));

}
}
