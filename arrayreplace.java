import java.util.*;
class arrayreplace
{
	public static void main(String args[])
	{
		int n,i,j,k;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		n=obj.nextInt();
		int a[]=new int[100];
		System.out.println("Enter the elements in the array");
		for(i=0;i<n;i++)
			a[i]=obj.nextInt();
		System.out.println("Enter the position of the element in the array to be replaced");
		j=obj.nextInt();
		System.out.println("Enter the correct element");
		k=obj.nextInt();
		a[j-1]=k;
		System.out.println("The replaced array is ");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
