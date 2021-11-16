import java.util.*;
class MergeSort2
{

	static int[] merge(int arr1[], int arr2[])
	{
		int m=arr1.length;
		int n=arr2.length;
		int arr3[]=new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++]=arr1[i++];
			}
			else
			{
				arr3[k++]=arr2[j++];
			}
		}
		while(i<m && k<(m+n))
		{
			arr3[k++]=arr1[i++];
		}
		while(j<n && k<(m+n))
		{
			arr3[k++]=arr2[j++];
		} 
		return arr3; 
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt();
		int n=obj.nextInt();
		int arr1[]=new int[m];
		int arr2[]=new int[n];


		System.out.println("enter first array elements");
		for(int i=0;i<m;i++)
		{
			arr1[i]=obj.nextInt();
		}

		System.out.println("enter second array elements");
		for(int i=0;i<n;i++)
		{
			arr2[i]=obj.nextInt();
		}

		merge(arr1,arr2);
		int arr3[]=merge(arr1,arr2);


		System.out.println("sorted array");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		} 

	}
}