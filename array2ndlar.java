import java.util.*;
class array2ndlar
{
	public static void main(String args[])
	{
		int n,i,lar,sl;
		Scanner obj=new Scanner(System.in);
		System.out.println("To find the 2nd largest element of an array");
		System.out.println("Enter the number of elements of the array");
		n=obj.nextInt();
		int a[]=new int[100];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++)
			a[i]=obj.nextInt();
		lar=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>lar)
				lar=a[i];
		}
		sl=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>sl && a[i]<lar)
				sl=a[i];
		}
		System.out.println("Second largest elements of the array is "+sl);
	}
}
