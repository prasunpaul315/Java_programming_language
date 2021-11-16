import java.util.Scanner;
class SecondLargest
{
	public static int firstLargest(int arr[])
	{
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		return max;
	}
	public static int secondLargest(int arr[], int l)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[l])
			{
				//if(res==-1)
				//	res=i;
				if(arr[i]>arr[res])
					res=i;
			}
		}
		return res;
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
		int largest=firstLargest(arr);
		//System.out.println(arr[largest]);
		int second=secondLargest(arr,largest);
		System.out.println("second largest element index "+second+" element is "+arr[second]);
	}
}