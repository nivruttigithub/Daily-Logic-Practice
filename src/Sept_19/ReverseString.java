package Sept_19;

public class ReverseString {
public static void main(String args[])
{
	String str = "Nivr    utti";
	str=str.trim();
	str = str.replaceAll(" ", "");
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev = rev+str.charAt(i);
	}
	System.out.println(rev);
}
}
