package Sept_16;

public class LeapYear {
	public static void main(String args[]) {
		int year = 2002;
		boolean isLeapYear = (year % 4 == 0 || year % 100 == 0 || year % 400 == 0);
		if (isLeapYear) {
			System.out.println(year + " is a Leap year...");
		} else {
			System.out.println(year + " is Not a Leap Year....!");
		}
	}
}
