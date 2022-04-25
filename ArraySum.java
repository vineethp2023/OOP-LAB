import java.util.*;
public class ArraySum
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n,i=0;
	System.out.println("\n Enter the size of array\n");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("\n Enter "+n+" elements into the array\n");
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	int sum=0;
	System.out.println("\n Entered array elements are\n");
	for(i=0;i<n;i++)
	{
		sum=sum+a[i];
		System.out.print(a[i]+"\t");
	}
	System.out.println("\n The sum of array elemnts is  : "+sum);
}
}