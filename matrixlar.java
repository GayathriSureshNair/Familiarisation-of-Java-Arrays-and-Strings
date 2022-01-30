import java.util.*;
class matrixlar
{
	public static void main(String args[])
	{
		int n,m,i,j,lar;
		int a[][]=new int[50][50];
		Scanner obj=new Scanner(System.in);
		System.out.println("To find the largest element in a matrix");
		System.out.println("Enter the number of rows in the matrix");
		n=obj.nextInt();
		System.out.println("Enter the number of columns in the matrix");
		m=obj.nextInt();
		System.out.println("Enter the elements of the matrix");
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]=obj.nextInt();
		lar=a[0][0];
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				if(a[i][j]>lar)
					lar=a[i][j];
		System.out.println("The largest element in the matrix is: "+lar);
	}
}
