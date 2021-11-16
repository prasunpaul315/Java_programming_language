import java.util.Scanner;
class FibonacciUsingRecursion
{
	public static int getFib(int n)
	{
		if(n<=0)
			return 0;
		if(n==1)
			return 1;
		return (getFib(n-2)+getFib(n-1));
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=0;i<=n;i++)
		{
			int f=getFib(i);
			System.out.print(f+"\t");
		}
		System.out.println(" ");
	}
}