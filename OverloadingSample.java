import java.util.Scanner;
class Shape
{
double l,b,h,r,w;
double area;
int flag;
Shape(double l,double b,double h,double w,double r)
{
this.l=l;
this.b=b;
this.h=h;
this.w=w;
this.r=r;
}
void find_area(double l,double b)
{
area=(l*b);
}
void find_area(double r)
{
area= (3.14*r*r);
}
void find_area(int flag,double w, double h)
{
if(flag==1)
area=(0.5*w*h);
else
area=0;
}

void display()
{
System.out.println("\n DETAILS OF CIRCLE\n");
System.out.println("\n RADIUS : "+r);
System.out.println("\n AREA   : "+area);
System.out.println("\n--------------------\n");
System.out.println("\n DETAILS OF RECTANGLE\n");
System.out.println("\n LENGTH	: "+l);
System.out.println("\n BREADTH  : "+b);
System.out.println("\n AREA	: "+area);
System.out.println("\n----------------------\n");
System.out.println("\n DETAILS OF TRIANGLE\n");
System.out.println("\n BREADTH	: "+w);
System.out.println("\n HEIGHT   : "+h);
System.out.println("\n AREA	: "+area);
}
}
public class OverloadingSample
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double l,b,r,w,h;
int flag=1;
System.out.println("\n Enter the length and breadth of rectangle: ");
l=sc.nextDouble();
b=sc.nextDouble();
System.out.println("\n Enter the radius of the circle : ");
r=sc.nextDouble();
System.out.println("\n Enter the height and breadth of the triangle: ");
h=sc.nextDouble();
w=sc.nextDouble();
Shape ob1=new Shape(l,b,h,w,r);
ob1.find_area(r);
ob1.find_area(l,b);
ob1.find_area(flag,w,h);
System.out.println("\n INFORMATION OF ALL SHAPES \n");
ob1.display();
}
}
