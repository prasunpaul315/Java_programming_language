class TOH
{
	//Move disk from A to B via C
	public static void diskMove(int n, char a, char b, char c)
	{
		if(n>=1)
		{
			diskMove(n-1, a,c,b);
			System.out.println("move disk "+n+" from "+a+" to "+b);
		//	count++;
			diskMove(n-1, c,b,a);
		}
		//System.out.println("total count "+c);
	}

	public static void main(String args[])
	{
		int d=3;
		diskMove(d,'a','b','c');
	}
}