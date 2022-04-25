import java.util.*;
public class Pallindrome
{
	public static void main(String args[])
	{
		String str1,reversed="";
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter a string or number: ");
		str1=sc.nextLine();
		int length=str1.length();
		for(int i=length-1;i>=0;i--)
		{
			reversed=reversed+str1.charAt(i);
		}
		if(reversed==str1)
		{
			System.out.println("\n The given value is pallindrome\n");
		}
		else
			System.out.println("\n The given value is not a pallindrome\n");
	}
}