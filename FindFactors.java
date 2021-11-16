import java.util.Scanner;
class FindFactors
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i;
		int n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		while(i>=1)
		{
			if(n%i==0)
				System.out.println(n/i);
		}
	}
}