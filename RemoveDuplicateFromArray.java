import java.util.Scanner;
class RemoveDuplicateFromArray
{
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=obj.nextInt();
	}
/*	int temp[]=new int[n];
	temp[0]=arr[0];
	int res=0;
	for(int i=0;i<n;i++)
	{
		if(temp[res]!=arr[i])
		{
			temp[res+1]=arr[i];
			res++;
		}
	}
	System.out.println("");
	for(int i=0;i<res+1;i++)
	{
		System.out.print(temp[i]+" ");
	} */

	/* Efficient solution */

	int res=0;
	for(int i=1;i<n;i++)
	{
		if(arr[res]!=arr[i])
		{
			arr[res+1]=arr[i];
			res++;
		}
	}
	for(int i=0;i<=res;i++)
	{
		System.out.print(arr[i]+" ");
	}


	} 

	

	
}