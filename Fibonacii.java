import java.util.Scanner;
public class Fibonacii
{
	public static void main(String args[])
	{
		int f=0,s=1,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the number of terms: ");
		int n=sc.nextInt();
		System.out.println("\n the fibonacii series upto "+n+" terms are\n");
		int i=3;
		System.out.print(f+"\t"+s);
		do
		{
			t=f+s;
			System.out.print("\t"+t);
			f=s;
			s=t;
			i++;
		}
		while(i<=n);
	}
}