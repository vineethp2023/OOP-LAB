import java.io.*;
class Student
{
int id;
String name;
String course;
int age;
Student(int id,String name,String course,int age)
{
this.id=id;
this.name=name;
this.course=course;
this.age=age;
}
}
class Sports extends Student
{
String item;
int item_code;
double height,weight;
Sports(int id,String name,String course,int age,String item,int item_code,double height,double weight)
{
super(id,name,course,age);
this.item=item;
this.item_code=item_code;
this.height=height;
this.weight=weight;
}
}
class Result extends Sports
{
int m1,m2,m3;
int mark,smark;
String result;
Result(int id,String name,String course,int age,String item,int item_code,double height,double weight)
{
super(id,name,course,age,item,item_code,height,weight);
}
void get_data()
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("\n Enter the marks of three subjects:\n");
m1=Integer.parseInt(br.readLine());
m2=Integer.parseInt(br.readLine());
m3=Integer.parseInt(br.readLine());
System.out.println("\n Enter the point got in "+item+": ");
smark=Integer.parseInt(br.readLine());
mark=m1+m2+m3;
}
catch(Exception e)
{
}
}
void display()
{
System.out.println("\n RESULT SUMMARY\n");
System.out.println("\n ID	: "+id);
System.out.println("\n NAME	: "+name);
System.out.println("\n AGE	: "+age);
System.out.println("\n COURSE: "+course);
System.out.println("\n SPORTS ITEM: "+item);
System.out.println("\n ITEM CODE : "+item_code);
System.out.println("\n HEIGHT	: "+height);
System.out.println("\n WEIGHT	: "+weight);
System.out.println("\n POINTS IN "+item+": "+smark);
}
}
public class ResultSummary
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int id,age;
String name,course;
String item;
int item_code;
double height,weight;
try
{
System.out.println("\n Enter the id: \n");
id=Integer.parseInt(br.readLine());
System.out.println("\n Enter the name : ");
name=br.readLine();
System.out.println("\n Enter the course: ");
course=br.readLine();
System.out.println("\n Enter the age : ");
age=Integer.parseInt(br.readLine());
System.out.println("\n Enter the item code : ");
item_code=Integer.parseInt(br.readLine());
System.out.println("\n Enter the sports item: ");
item=br.readLine();
System.out.println("\n Enter the height : ");
height=Double.parseDouble(br.readLine());
System.out.println("\n Enter the weight : ");
weight=Double.parseDouble(br.readLine());
Result r=new Result(id,name,course,age,item,item_code,height,weight);
r.get_data();
r.display();
}
catch(Exception e)
{
}
}
}





