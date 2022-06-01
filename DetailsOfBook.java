import java.io.*;
class Publisher
{
int pid;
String pname;
Publisher(int pid,String pname)
{
this.pid=pid;
this.pname=pname;
}
}
class Book extends Publisher
{
int bid;
String title;
String author;
int price;
int nop;
Book(int pid,String pname,int bid,String title,int price,int nop,String author)
{
super(pid,pname);
this.bid=bid;
this.title=title;
this.price=price;
this.nop=nop;
this.author=author;
}
}
class Literature extends Book
{
String language;
int rating;
int year;
Literature(int pid,String pname,int bid,String title,int price,int nop,String author,String language,int rating,int year)
{
super(pid,pname,bid,title,price,nop,author);
this.language=language;
this.rating=rating;
this.year=year;
}
void display()
{
System.out.println("\n PUBLISHER ID	: "+pid);
System.out.println("\n PUBLISHER	: "+pname);
System.out.println("\n BOOK ID	: "+bid);
System.out.println("\n TITLE	: "+title);
System.out.println("\n PRICE	: "+price);
System.out.println("\n NO. OF PAGES	: "+nop);
System.out.println("\n LANGUAGE	: "+language);
System.out.println("\n AUTHOR	: "+author);
System.out.println("\n RATING	: "+rating);
System.out.println("\n YEAR OF PUBLISHING	: "+year);
} 
}
class Fiction extends Book
{
String category;
String type;
int year;
Fiction(int pid,String pname,int bid,String title,int price,int nop,String author,String category,String type,int year)
{
super(pid,pname,bid,title,price,nop,author);
this.category=category;
this.type=type;
this.year=year;
}
void display()
{
System.out.println("\n PUBLISHER ID	: "+pid);
System.out.println("\n PUBLISHER	: "+pname);
System.out.println("\n BOOK ID	: "+bid);
System.out.println("\n TITLE	: "+title);
System.out.println("\n PRICE	: "+price);
System.out.println("\n NO. OF PAGES	: "+nop);
System.out.println("\n AUTHOR	: "+author);
System.out.println("\n CATEGORY	: "+category);
System.out.println("\n TYPE / THEME	: "+type);
System.out.println("\n YEAR OF PUBLISHING	:"+year);
}
}
public class DetailsOfBook
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int opt;
int pid=0,price=0,bid=0,nop=0,year=0,rating=0;
String pname="",title="",category="",type="",language="",author="";
try
{
do
{
System.out.println("\n SELECT AN OPTION\n");
System.out.println("\n 1. I WANT TO ENTER A RECORD OF A LITERATURE\n");
System.out.println("\n 2. I WANT TO ENTER A RECORD OF A FICTION\n");
System.out.println("\n 3. I WANT TO EXIT\n");
opt=Integer.parseInt(br.readLine());
if(opt==1 || opt==2)
{
		System.out.println("\n Please fill the following \n");
		System.out.println("\n Enter publisher id	: \n");
		pid=Integer.parseInt(br.readLine());
		System.out.println("\n Enter the publisher's name:\n");
		pname=br.readLine();
		System.out.println("\n Enter the ID of the book : \n");
		bid=Integer.parseInt(br.readLine());
		System.out.println("\n Enter the title of the book : \n");
		title=br.readLine();
		System.out.println("\n Enter the price \n");
		price=Integer.parseInt(br.readLine());
		System.out.println("\n How many pages are of this book ? \n");
		nop=Integer.parseInt(br.readLine());
		System.out.println("\n Enter the name of author: \n");
		author=br.readLine();
}
switch(opt)
{

case 1: System.out.println("\n Enter the language of the book \n");
		language=br.readLine();
		System.out.println("\n Enter a rating \n");
		rating=Integer.parseInt(br.readLine());
		System.out.println("\n Enter year of publishing: \n");
		year=Integer.parseInt(br.readLine());
		break;
		
case 2: System.out.println("\n Enter the category of the book ? \n");
		category=br.readLine();
		System.out.println("\n Enter the theme of the content \n");
		type=br.readLine();
		System.out.println("\n Enter year of publishing: \n");
		year=Integer.parseInt(br.readLine());
		break;
		
case 3: System.exit(0);

default: System.out.println("\n Invalid Option\n");
}
if(opt==1)
{
	Literature ob1=new Literature(pid,pname,bid,title,price,nop,author,language,rating,year);
	ob1.display();
}
else
{
	Fiction ob2=new Fiction(pid,pname,bid,title,price,nop,author,category,type,year);
	ob2.display();
}
}
while(opt!=3);
}
catch(Exception e)
{
}
}
}