class ReverseArray
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		int n=arr.length-1;
		int i=0,temp;
		while(i<n)
		{
			temp=arr[i];
			arr[i]=arr[n];
			arr[n]=temp;
			i++;n--;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}

	}
}