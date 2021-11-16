import java.util.Scanner;
class CheckPrime
{
	public static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		boolean ans=false;
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		ans=isPrime(n);
		if(ans==true)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}