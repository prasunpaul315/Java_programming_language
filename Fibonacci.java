import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n==0)
			System.out.println(0+" ");
		else if(n==1)
			System.out.println(0+" "+1);
		else
		{
			System.out.print(0+" ");
			System.out.print(1+" ");
			int a=1,b=1,c;
			for(int i=2;i<=n;i++)
			{
				c=a+b;
				System.out.print(c+" ");
			//	System.out.print(b+" ");
				a=b;b=c;
			}
			System.out.print("\n");
		}
	}
}