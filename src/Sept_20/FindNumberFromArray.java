package Sept_20;

import java.util.Scanner;

public class FindNumberFromArray {
	public static void main(String args[])
	{
		int arr[] = {10,20,15,0,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Whether is Present OR Not :");
		int no = sc.nextInt();
		
		boolean isPresent = false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==no)
			{
				isPresent = true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println(no+" is Present in Given Array");
		}
		else
		{
			System.out.println(no+" is Not Present in Given Array...!!");
		}
	}

}
