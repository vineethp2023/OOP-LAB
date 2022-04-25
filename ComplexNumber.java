import java.util.*;
public class ComplexNumber
{

	public static void main(String args[])
	{
		double real1,real2,imag1,imag2;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the real part of first complex number\n");
		real1=sc.nextDouble();
		System.out.println("\n Enter the imaginary part of the first complex number\n");
		imag1=sc.nextDouble();
		System.out.println("\n the first complex number you have entered is : "+real1+"+"+imag1+"i");
		System.out.println("\n Enter the real part of second complex number\n");
		real2=sc.nextDouble();
		System.out.println("\n Enter the imaginary part of the second complex number\n");
		imag2=sc.nextDouble();
		System.out.println("\n The second complex number you have entered is : "+real2+imag2+"+"+"i");
		double rsum=real1+real2;
		double imagsum=imag1+imag2;
		System.out.println("\n The sum of complex number 1 and complex number 2 is: "+rsum+"+"+imagsum+" i");
	}
}
		
	