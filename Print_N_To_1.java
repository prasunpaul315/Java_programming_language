import java.util.Scanner;
class Print_N_To_1
{
	public static void printNo(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		printNo(n-1);
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		printNo(n);
	}
}