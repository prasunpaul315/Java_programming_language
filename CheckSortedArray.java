class CheckSortedArray
{
	public static boolean isSorted(int arr[])
	{
		//int x=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		int arr[]={-1,-1};
		boolean ans=isSorted(arr);
		if(ans==true)
			System.out.println("sorted");
		else
			System.out.println("not sorted");

	}
}