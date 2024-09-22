package Sept_18;

public class SecondMaxNumber {
public static void main(String args[])
{
	int arr[] = {12,3,45,78,40,23,43,10};
	int max = arr[0];
	int secMax = arr[1];
	for(int i=1;i<=arr.length-1;i++)
	{
		if(arr[i]>max)
		{
			secMax = max;
			max = arr[i];
		}
		else if(arr[i]>secMax && arr[i] != max)
		{
			secMax = arr[i];
		}
	}
	System.out.println("Second Max Number is : "+secMax);
}
}
