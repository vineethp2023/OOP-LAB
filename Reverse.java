
import java.util.*;
import java.io.*;
public class Reverse
{
	public static void main(String args[])
	{
		int num;
		int rem=0,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter a number");
		num=sc.nextInt();
		int digit=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("\n The reverse of "+digit+" is  " +rev);
	}
}