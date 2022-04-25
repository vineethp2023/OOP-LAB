import java.util.Scanner;
import java.lang.*;
public class MatrixMult
{
	int m1,n1,m2,n2,i,j,k;
	int[][] a,b,c;
	Scanner sc=new Scanner(System.in);
	void check_data()
	{
		System.out.println("\n Enter the order of matrix one: ");
		m1=sc.nextInt();
		n1=sc.nextInt();
		System.out.println("\n Enter the order of second matrix: ");
		m2=sc.nextInt();
		n2=sc.nextInt();
		if(m1!=n2)
		{
			System.out.println("\n Matrix Multiplication not possible");
		}
		else
		{
			int[][] a=new int[m1][n1];
			int[][] b=new int[m2][n2];
			int[][] c=new int[m1][n2];
			for(i=0;i<m1;i++)
				for(j=0;j<n1;j++)
					a[i][j]=0;
			for(i=0;i<m2;i++)
				for(j=0;j<n2;j++)
					b[i][j]=0;
		
		System.out.println("\n Input "+m1*n1+" elements of first matrix: ");
		for(i=0;i<m1;i++)
			for(j=0;j<n1;j++)
				a[i][j]=sc.nextInt();
		System.out.println("\n Input "+m2*n2+" elements of second matrix: ");
		for(i=0;i<m2;i++)
			for(j=0;j<n2;j++)
				b[i][j]=sc.nextInt();
	    }
	}
	void display()
	{
		System.out.println("\n Entered Matrices are displayed below\n");
		System.out.println("\n Matrix one\n");
		for(i=0;i<m1;i++)
		{
			System.out.println("\n");
			for(j=0;j<n1;j++)
			System.out.print(a[i][j]+"\t");
		}
		System.out.println("\n Matrix Two\n");
		for(i=0;i<m2;i++)
		{
			System.out.println("\n");
			for(j=0;j<n2;j++)
			System.out.print(b[i][j]+"\t");
		}
	}
	void multiply()
	{
		if(m1==n2)
		{
			for(i=0;i<m1;i++)
			{
				for(j=0;j<n1;j++)
				{
					c[i][j]=0;

					for(k=0;k<m2;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		}
		System.out.println("\n Product of two matrices is \n");
		for(i=0;i<m2;i++)
		{
			System.out.println("\n");
			for(j=0;j<n2;j++)
			System.out.print(b[i][j]+"\t");
		}
	}
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  MatrixMult ob=new MatrixMult();
	  int opt;
	  do
	  {
	  System.out.println("\n SELECT AN OPTION FROM THE MENU\n");
	  System.out.println("\n1. READ MATRIX \n2.DISPLAY MATRIX \n3.PERFORM MULTIPLICATION\n");
	  opt=sc.nextInt();
	  switch(opt)
	  {
		  case 1: ob.check_data();
				  break;
		  case 2: ob.display();
				  break;
		  case 3: ob.multiply();
		          break;
		  case 4: System.exit(0);
		  
		  default: System.out.println("\n INVALID choice\n");
	  }
	  }
	  while(opt!=4);
  }
}
	