import java.util.Scanner;
import java.util.*;
class BinarySearchUsingREcursion
{

	static int binarySearch(int arr[], int l, int r, int key)
	{
		if(l>r) return -1;
		int mid=(int)Math.floor((l+r)/2);
		if(arr[mid]==key)
			return mid;
		else if(arr[mid]>key)
			return binarySearch(arr,l,mid-1,key);
		else 
			return binarySearch(arr,mid+1,r,key);
		
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
		int x=binarySearch(arr,0,n-1, key);
		System.out.println(x);


	}
}