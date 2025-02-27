package arrays;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 87, 45, 20 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min) {
				min = arr[i];

			}

		}
		System.out.println(max);
		System.out.println(min);

	}
}
