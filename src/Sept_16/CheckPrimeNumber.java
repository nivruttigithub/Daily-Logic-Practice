package Sept_16;

public class CheckPrimeNumber {
	public static void main(String args[]) {
		int no = 7;
		boolean isPrime = true;
		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(no + " is a Prime Number");
		} else {
			System.out.println(no + " is Not a Prime Number");
		}
	}
}
