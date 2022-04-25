import java.util.*;
public class ArraySearch
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n,i=0,key,flag=0;
	System.out.println("\n Enter the size of array\n");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("\n Enter "+n+" elements into the array\n");
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.println("\n Entered array elements are\n");
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]+"\t");
	}
	System.out.println("\n Enter an element to be searched : ");
	key=sc.nextInt();
	for(i=0;i<=n;i++)
	{
		if(a[i]==key)
		{
			flag=1;
			break;
		}
	
	}
	if(flag==1)
		System.out.println("\n The key "+key+" is found at position "+(i+1));
	else
		System.out.println("\n Key is not present in the array\n");
	}
}
	