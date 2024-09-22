package Sept_19;

public class StrongNumber {
	public static void main(String args[]) {
		
		int no = 145;
		isStrongNumber(no);
	}

	public static void isStrongNumber(int no) {
		int temp = no;
		int result = 0;
		while (no > 0) {
			int digit = no % 10;
			result = result + factorial(digit);   //1+24+120
			no = no / 10;
		}
		if (result == temp) {
			System.out.println(temp + " is Strong Number");
		} else {
			System.out.println(temp + " is Not a Strong Number");
		}
	}

	public static int factorial(int digit) {
		int fact = 1;
		for (int i = 1; i <= digit; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
