import java.util.Scanner;
class SumOfNaturalNo
{
	public static int sum(int n, int k)
	{
		if(n==0)
			return k;
		k=k+n;
		return sum(n-1,k);
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=0;
		int sum=sum(n,k);
		System.out.println(sum);
	}
}