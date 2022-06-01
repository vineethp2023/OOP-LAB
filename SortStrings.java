import java.util.*;
public class SortStrings
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	int i,j;
	String temp;
	System.out.println("\n Enter the number of strings\n");
	n=sc.nextInt();
	sc.nextLine();
	String[] str1=new String[n];
	System.out.println("\n Enter "+n+" strings in random order\n");
	for(i=0;i<n;i++)
		str1[i]=sc.nextLine();
	System.out.println("\n The entered strings are\n\n");
	for(i=0;i<n;i++)
		System.out.print(str1[i]+"\t");
	for(i=0;i<n-1;i++)
		for(j=i+1;j<n;j++)
		{
			if(str1[i].compareTo(str1[j])>0)
			{
				temp=str1[i];
				str1[i]=str1[j];
				str1[j]=temp;
			}
		}
	System.out.println("\n\n\n The Strings in sorted order\n\n");
	for(i=0;i<n;i++)
		System.out.println(str1[i]);
}
}

