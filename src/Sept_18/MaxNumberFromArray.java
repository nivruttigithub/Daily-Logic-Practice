package Sept_18;

public class MaxNumberFromArray {
public static void main(String args[])
{
	int arr[] = {12,34,54,3,60,23,1,8,90};
	int max=arr[0];
	for (int i=1;i<=arr.length-1;i++) {
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("Maximum Number : "+max);
}
}
