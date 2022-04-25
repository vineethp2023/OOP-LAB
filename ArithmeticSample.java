import java.util.*;
public class ArithmeticSample
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("\n Sum of "+a+" and "+b+" is: "+c);
		c=a-b;
		System.out.println("\n Difference between "+a+" and "+b+" is: "+c);
		c=a*b;
		System.out.println("\n Product of "+a+" and "+b+" is: "+c);
		c=a/b;
		System.out.println("\n"+a+" divided by "+b+" is: "+c);
		c=a%b;
		System.out.println("\n Result of modular division is: "+c);
		
	}
}

