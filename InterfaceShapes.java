import java.io.*;
interface AreaAndPerimeter
{
double area();
double peri();
}
class Circle implements AreaAndPerimeter
{
double r;
Circle(double r)
{
this.r=r;
}
public double area()
{
	return 3.14*r*r;
}
public double peri()
{
return 2*3.14*r;
}
}
class Rectangle implements AreaAndPerimeter
{
double l,b;
Rectangle(double l,double b)
{
this.l=l;
this.b=b;
} 
public double area()
{
	return l*b;
}
public double peri()
{
return 2*(l+b);
}
}
public class InterfaceShapes
{
public static void main(String args[])
{
double r=0,l=0,b=0;
int opt;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
do
{
System.out.println("\n Enter a choice \n");
System.out.println("\n 1. CIRCLE\n");
System.out.println("\n 2. RECTANGLE\n");
System.out.println("\n 3. EXIT\n");
opt=Integer.parseInt(br.readLine());
if(opt==1)
{
System.out.println("\n Enter the radius of the circle\n");
r=Double.parseDouble(br.readLine());
Circle c1=new Circle(r);
c1.area();
System.out.println("\n Perimeter of the circle: "+c1.peri());
System.out.println("\n area of the circle: "+c1.area());
}
if(opt==2)
{
System.out.println("\n Enter the length and breadth of the rectangle\n");
l=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
Rectangle r1=new Rectangle(l,b);
System.out.println("\n Area of the rectangle : "+r1.area());
System.out.println("\n Perimeter of the rectangle: "+r1.peri());
}
}
while(opt!=3);
}
catch(Exception e)
{
}
}
}
