import java.util.*;
public class ArraySort
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	int i=0,j=0,temp;
	System.out.println("\n Enter the size of array\n");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("\n Enter "+n+" elements into the array\n");
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.println("\n Entered array elements are\n");
	for(i=0;i<n;i++)
		System.out.print(a[i]+"\t");
	for(i=0;i<n;i++)
	{
	for(j=0;j<n-i-1;j++)
	{
	if(a[j]>a[j+1])
	{
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}
	}
	}
	System.out.println("\n Sorted array elements are\n");
	for(i=0;i<n;i++)
	{
	System.out.print(a[i]+"\t");
	}
}
}