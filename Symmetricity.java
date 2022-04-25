import java.util.Scanner;
public class Symmetricity
{
	public static void main(String arg[])
	{
		int row,col,m,n;
		int i,j;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the order of matrix: ");
		m=sc.nextInt();
		n=sc.nextInt();
		int[][] a=new int[m][n];
		int[][] b=new int[m][n];
		System.out.println("\n Enter "+m*n+" elements into the matrix:\n");
		for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		System.out.println("\n The entered matrix is\n");
		for(i=0;i<m;i++)
		{
			System.out.println("\n");
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+"\t");
		}
		
		System.out.println("\n The transpose of the matrix is\n");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=a[j][i];
				if(a[i][j]!=a[j][i])
					flag=1;
			}
		}
		for(i=0;i<m;i++)
		{
			System.out.println("\n");
			for(j=0;j<n;j++)
				System.out.print(b[i][j]+"\t");
		}
	if(flag==0)
		System.out.println("\n The matrix is Symmetric\n");
	else 
		System.out.println("\n The matrix is not Symmetric\n");
	}
}
		
		
				
		