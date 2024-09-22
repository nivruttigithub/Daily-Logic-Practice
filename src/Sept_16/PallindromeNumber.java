package Sept_16;

public class PallindromeNumber {
	public static void main(String args[]) {
		int no = 151;
		int result = 0;
		int temp = no;
		int r;
		while (no != 0) {
			r = no % 10;
			result = (result * 10) + r;
			no = no / 10;
		}
		if (temp == result) {
			System.out.println(temp + " is a Pallindrome Number...");
		} else {
			System.out.println(temp + " is Not a Pallindrome Number...!");
		}
	}
}
