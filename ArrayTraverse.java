import java.io.*;
public class ArrayTraverse
{
	public static void main(String args[])
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n;
		int i=0;
		try
		{
		System.out.println("\n Enter the size of array\n");
		n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.println("\n Enter "+n+" elements into the array\n");
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
		System.out.println("\n The elements in the array are\n");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		}
		catch(IOException e)
		{
		}
	}
}