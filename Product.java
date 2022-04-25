import java.util.*;
public class Product
{
int pcode;
String pname;
double price;
Scanner sc=new Scanner(System.in);
	Product()
	{
		pcode=0; pname="";price=0.0;
	}
	Product(int pcode,String pname,double price)
	{
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	void get_item()
	{
		System.out.println("\n Enter a produt code : ");
		pcode=sc.nextInt();
		sc.nextLine();
		System.out.println("\n Enter a product name: ");
		pname=sc.nextLine();
		System.out.println("\n Enter the price : ");
		price=sc.nextDouble();
	}
		
	public double calc_price(Product ob1,Product ob2,Product ob3)
	{
		double g;
		if(ob1.price>ob2.price)
		{
			if(ob1.price>ob3.price)
			{
				g=ob1.price;
			}
			else
				 g=ob3.price;
		}
		else
		{
			if(ob2.price > ob3.price)
			{
				g=ob2.price;
			}
			else 
				g=ob3.price;
		}
	 return g;	
	}
	public  void display_item()
	{
		System.out.println("\n PRODUCT INFORMATION\n");
		System.out.println("\n============================\n");
		System.out.println("\n PRODUCT CODE    :    "+pcode);
		System.out.println("\n PRODUCT NAME  :    "+pname);
		System.out.println("\n PRODUCT PRICE :    "+price);
		System.out.println("\n---------------------------\n");
	}
	public static void main(String args[])
	{
		
		Product p1=new Product(101,"biscuit",35);
		
		Product p2=new Product();
		p2.pname="cake";
		p2.pcode=102;
		p2.price=55;
		
		Product p3=new Product();
		p3.get_item();
		
		System.out.println("\n The details of product 1 is:\n");
		p1.display_item();
		System.out.println("\n The details of Product 2 is\n");
		p2.display_item();
		System.out.println("\n The details of product 3 is \n");
		p3.display_item();
		
		System.out.println("\n The Product having biggest price is : "+p1.calc_price(p1,p2,p3));
	}
}
		
		