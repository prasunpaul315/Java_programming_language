import java.util.Scanner;
class First_N_natural_no
{
	static int sum(int x)
	{
		int s=0;
		for(int i=1;i<=x;i++)
		{
			s=s+i;
		}
		return s;
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println(sum(n));
	}
}