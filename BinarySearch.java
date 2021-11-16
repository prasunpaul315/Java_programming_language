import java.util.Scanner;
import java.util.*;
class BinarySearch
{
	static int binarySearch(int arr[], int n, int key)
	{
		int f=0,l=n;
		while(f<=l)
		{
			int mid= (int) Math.floor((l+f)/2);
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				l=mid-1;
			else 
				f=mid+1;
		}
		return -1;
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}


		System.out.println("Enter");
		int key=obj.nextInt();
		int x=binarySearch(arr,n-1, key);
		System.out.println(x);


	}
}