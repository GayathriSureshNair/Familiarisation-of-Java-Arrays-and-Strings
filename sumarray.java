import java.util.*;
class sumarray
{
	public static void main(String args[])
	{
		int sum,i,n;
		sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("To find the sum of elemnts in an array");
		System.out.println("Enter the number of elements in the array");
		n=obj.nextInt();
		int a[]=new int[20];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++)
			a[i]=obj.nextInt();
		for(i=0;i<n;i++)
			sum=sum+a[i];
		System.out.println("Sum of the elements of the array is "+sum);
	}
}
		
