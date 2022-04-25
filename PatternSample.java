import java.util.*;
class PatternSample
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter the number of rows: ");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
	System.out.print("\n");
	for(j=1;j<=i;j++)
	System.out.print("*");
}
}
}