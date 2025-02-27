package others;

public class PrimeNumber {

	public static void primeNumbers(int n) {

		int temp = 0;
		// https://www.youtube.com/watch?v=u9NT9kjNRys
		// no divisble by itself and 1 so we need to check its divisibilty from 2 t0 6
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("no is prime");
		} else {
			System.out.println("no is not prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=11;
		primeNumbers(j);

	}
}
