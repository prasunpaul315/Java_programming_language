import java.util.*;
class SelectionSort
{
	static void selection(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
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
		selection(arr, n);
		System.out.println("after sort");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}