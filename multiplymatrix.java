import java.util.*;
class multiplymatrix
{
	public static void main(String args[])
	{
		int i=0,j=0,sum=0,k;
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int c[][]=new int[50][50];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of rows in matrix A:");
		int r1=obj.nextInt();
		System.out.println("Enter number of columns in matrix A:");
		int c1=obj.nextInt();
		System.out.println("Enter number of rows in matrix B:");
		int r2=obj.nextInt();
		System.out.println("Enter number of columns in matrix B:");
		int c2=obj.nextInt();
		System.out.println("Enter elements in matrix A:");
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
				a[i][j]=obj.nextInt();
		System.out.println("Enter elements in matrix B:");
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
				b[i][j]=obj.nextInt();
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				sum=0;
				for(k=0;k<c1;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
				}
			c[i][j]=sum;
			}
		}
		if(c1!=r2)
			System.out.println("Matrix multiplication not possible");
		else
		{
			System.out.println("New matrix is:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
					System.out.print(c[i][j]+"\t");
				System.out.print("\n");
			}
		}
	}
}
