package Sept_19;

public class ArmStrongNumberWithinRange {
	public static void main(String args[]) {
		int start = 100;
		int end = 999;
		System.out.println("ArmStrong Number between " + start + " to " + end + " is : ");
		printArmStrongNumber(start, end);
	}

	public static void printArmStrongNumber(int start, int end) {
		for (int num = start; num <= end; num++) {
			if (isArmStrong(num)) {
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isArmStrong(int num) {
		int temp = num;
		int result = 0;
		int r;
		while (num != 0) {
			r = num % 10;
			result = result + r * r * r;
			num = num / 10;
		}
		if (temp == result) {
			return true;
		} else {
			return false;
		}
	}
}
