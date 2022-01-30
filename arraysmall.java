import java.util.*;
class arraysmall
{
	public static void main(String args[])
	{
		int n,i,small;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		n=obj.nextInt();
		int a[]=new int[100];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++)
			a[i]=obj.nextInt();
		small=a[0];
		for(i=0;i<n;i++)
			if(a[i]<small)
				small=a[i];
		System.out.println("The smallest element in the array is: "+small);
	}
}
