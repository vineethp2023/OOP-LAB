import java.util.Scanner;
public class MatrixAddition
{
	public static void main(String args[])
	{
	int m,n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter the order of the matrices\n");
	m=sc.nextInt();
	n=sc.nextInt();
	int[][] mat1=new int[m][n];
	int[][] mat2=new int[m][n];
	int[][] mat3=new int[m][n];
	System.out.println("\n Enter "+(m*n)+" elements into the first matrix: ");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
		mat1[i][j]=sc.nextInt();
	System.out.println("\n Enter "+(m*n)+" elements into the second matrix: ");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			mat2[i][j]=sc.nextInt();
	for(i=0;i<m;i++)
	for(j=0;j<n;j++)
		mat3[i][j]=mat1[i][j]+mat2[i][j];
	System.out.println("\n The entered matrices are\n");
	System.out.println("\n The matrix 1 is\n");
	for(i=0;i<m;i++)
	{
		System.out.println("\n");
		for(j=0;j<n;j++)
			System.out.print(mat1[i][j]+"\t");
	}
	System.out.println("\n The matrix 2 is\n");
	for(i=0;i<m;i++)
	{
		System.out.println("\n");
		for(j=0;j<n;j++)
			System.out.print(mat2[i][j]+"\t");
	}
	System.out.println("\n After matrix Addition, the resultant matrix is\n ");
	for(i=0;i<m;i++)
	{
		System.out.println("\n");
		for(j=0;j<n;j++)
			System.out.print(mat3[i][j]+"\t");
	}
	}
}
	
	
	