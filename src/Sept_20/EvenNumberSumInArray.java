package Sept_20;

public class EvenNumberSumInArray {
	public static void main(String args[])
	{
		int arr[] = {4,2,1,5,6,10};
		int sumOfEven = 0;
		System.out.println("Even Number in Given Array is :");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				sumOfEven = sumOfEven+arr[i];
			}
		}
		System.out.println("Sum Of All the Even Number Present in Array is "+sumOfEven);
	}
}
