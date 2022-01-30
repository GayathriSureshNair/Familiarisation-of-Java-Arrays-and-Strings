import java.util.*;
class trace
{
	public static void main(String args[])
	{
		int i,j,n,m,sum;
		sum=0;
		int a[][]=new int[20][20];
		Scanner obj=new Scanner(System.in);
		System.out.println("To find the trace of a matrix");
		System.out.println("Enter the number of rows of the matrix");
		n=obj.nextInt();
		System.out.println("Enter the number of columns of the matrix");
		m=obj.nextInt();
		if(n!=m)
			System.out.println("The number of rows and columns must be same to find the trace of a matrix");
		else
		{
			System.out.println("Enter the elements of the matrix");
			for(i=0;i<n;i++)
				for(j=0;j<m;j++)
					a[i][j]=obj.nextInt();
			for(i=0;i<n;i++)
				for(j=0;j<m;j++)
					if(i==j)
						sum=sum+a[i][j];
			System.out.println("The trace of the matrix is "+sum);
		}
	}
}
