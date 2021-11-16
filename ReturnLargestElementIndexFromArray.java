class ReturnLargestElementIndexFromArray
{
	public static int returnIndex(int arr[])
	{
		int max=arr[0], index=0, n=arr.length;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		return index;
	}
	public static void main(String args[])
	{
		int arr[]={-1,10};
		//arr[0]=5; arr[1]=10; arr[2]=15; arr[3]=20;arr[4]=2;
		int index=returnIndex(arr);
		System.out.println(index);
	}
}