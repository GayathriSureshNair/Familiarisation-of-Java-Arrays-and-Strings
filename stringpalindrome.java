import java.util.*;
class stringpalindrome
{
	public static void main(String args[])
	{
		int i,j,flag=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=obj.nextLine();
		int n=s.length();
		for(i=n-1,j=0;i>=0 && j<n;i--,j++)
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=1;
				break;
			}
		if(flag==1)
			System.out.println("The string is not palindrome");
		else
			System.out.println("The string is palindrome");
	}
}
