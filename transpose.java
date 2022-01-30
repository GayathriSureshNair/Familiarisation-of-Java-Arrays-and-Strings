import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int i,j,r,c;
		int a[][]=new int[20][20];
		int t[][]=new int[20][20];
		Scanner obj=new Scanner(System.in);
		System.out.println("Program to find the transpose of a given matrix");
		System.out.println("Enter the number of rows in the matrix");
		r=obj.nextInt();
		System.out.println("Enter the number of columns in the matrix");
		c=obj.nextInt();
		System.out.println("Enter the elements of the matrix");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=obj.nextInt();
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				t[i][j]=a[j][i];
		System.out.println("The transpose of the given matrix");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				System.out.println(t[i][j]);
	}
}
