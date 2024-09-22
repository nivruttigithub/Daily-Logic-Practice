package Sept_17;

public class CheckRotationalString {
public static void main(String arg[]) {
		String str1 = "Welcome";
		String str2 = "ComeWel";

		str1 = str1.trim().toLowerCase();
		str2 = str2.trim().toLowerCase();

		String str3 = str1 + str1;// welcomewelcome  ==>  

		if (str3.contains(str1)) {
			if (str1.length() == str2.length()) {
				System.out.println(str1 + " and " + str2 + " Both are Rotational String...");
			} else {
				System.out.println(str1 + " and " + str2 + " Both are Not Rotational String ....!");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are Not Rotational String....!");
		}
	}
}
