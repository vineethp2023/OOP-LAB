import java.io.*;
import graphics.*;
public class GraphicsDemo
{
public static void main(String args[])
{
double r,l,b,h,w;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("\n Enter the radius of circle : ");
r=Double.parseDouble(br.readLine());
Circle c1=new Circle(r);
System.out.println("\n The area of the circle is : "+c1.find_area(r,r));
System.out.println("\n Enter the length and breadth of the rectangle : ");
l=Double.parseDouble(br.readLine());
w=Double.parseDouble(br.readLine());
Rectangle r1=new Rectangle(l,w);
System.out.println("\n area of the rectangle is : "+r1.find_area(l,w));
System.out.println("\n enter the base-length of the triangle: ");
b=Double.parseDouble(br.readLine());
System.out.println("\n Enter the height of the triangle : ");
h=Double.parseDouble(br.readLine());
Triangle t1=new Triangle(b,h);
System.out.println("\n area of the triangle is : "+t1.find_area(b,h));
}
catch(Exception e)
{
}
}
}
