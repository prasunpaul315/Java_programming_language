class Insert_into_array
{
	public static int insert(int arr[], int cap, int n, int x, int pos)
	{
		if(cap==n)
			return n;
		int idx=pos-1;
		for(int i=n-1;i>=idx;i--)
			arr[i+1]=arr[i];
		arr[idx]=x;
		return n+1;
	}

	public static void main(String args[])
	{
		int arr[]=new int[5], cap=5,n=3;
		arr[0]=5; arr[1]=10; arr[2]=20;
		int x=7,pos=2;
		n=insert(arr,cap,n,x,pos);
		System.out.println("after insertion");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ "");
		}
	}
}