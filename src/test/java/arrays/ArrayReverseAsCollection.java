package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverseAsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr= {10,13,4,7,9};
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));

	}

}
