import java.util.*;
public class DigitSum
{
public static void main(String args[])
{
	int num,rem=0,copy;
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter a digit: ");
	num=sc.nextInt();
	copy=num;
	int sum=0;
	while(num!=0)
	{
		rem=num%10;
		sum=sum+rem;
		num/=10;
	}
	System.out.println("\n The sum of digits of "+copy+" is : "+sum);
}
}