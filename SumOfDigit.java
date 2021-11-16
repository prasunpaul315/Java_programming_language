import java.util.Scanner;
class SumOfDigit
{
	public static int sumOfDigit(int n, int k)
	{
		if(n==0)
			return k;
		k=k+n%10;
		n=n/10;
		return sumOfDigit(n,k);
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=0;
		int sum=sumOfDigit(n,k);
		System.out.println(sum);
	}
}