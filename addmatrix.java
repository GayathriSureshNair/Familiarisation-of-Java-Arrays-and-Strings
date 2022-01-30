import java.util.*;
class addmatrix
{
	public static void main(String args[])
	{
		int i,j,r,c;
		Scanner obj=new Scanner(System.in);
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int sum[][]=new int[20][20];
		System.out.println("Enter the number of rows");
		r=obj.nextInt();
		System.out.println("Enter the number of columns");
		c=obj.nextInt();
		System.out.println("Enter the elements of the 1st matrix");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=obj.nextInt();
		System.out.println("Enter the elements of the 2nd matrix");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				b[i][j]=obj.nextInt();
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				sum[i][j]=a[i][j]+b[i][j];
		System.out.println("The sum of the two matrices is");
		for(i=0;i<r;i++)		
		{
			for(j=0;j<c;j++)
				System.out.print(sum[i][j]+"\t");
			System.out.print("\n");
		}
	}
}	
