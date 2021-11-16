class Delete_from_array
{
	public static int delete(int arr[], int x, int n)
	{
		int i=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				break;
			}
		}
	//	if(i==n)
	//		return n;
		//System.out.println(pos);
		for(int j=i;j<n-1;j++)
			arr[j]=arr[j+1];
		return n-1;
	}

	public static void main(String args[])
	{
		int arr[]=new int[5],n=5;
		arr[0]=5; arr[1]=10; arr[2]=15; arr[3]=20;arr[4]=25;
		int x=15;
		n=delete(arr,x,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
}