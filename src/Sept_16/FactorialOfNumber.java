package Sept_16;

public class FactorialOfNumber {
	public static void main(String args[]) {
		int no = 5;
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Of " + no + " is " + fact);
	}
}