import java.util.Scanner;

class SumFind
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter 2 integers:\n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("\n The sum of "+a+" and "+b+" is: "+c);
    }
}