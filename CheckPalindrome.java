import java.util.Scanner;
class CheckPalindrome
{
	public static boolean checkPalindrome(String str, int s, int e)
	{
		if(s>=e)
			return true;
		return ((str.charAt(s)==str.charAt(e)) && checkPalindrome(str, s+1, e-1) );
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		int s=0, e=str.length()-1;
		boolean ans=checkPalindrome(str,s,e);
		if(ans==true)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome"); 
	
	}
}