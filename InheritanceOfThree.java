import java.io.*;
import java.lang.*;
class Person
{
String empname;
String gender,address;
int age;
Person(String empname,String gender,String address,int age)
{
this.empname=empname;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class Employee extends Person
{
int empid;
String company_name;
String qualification;
int salary;
Employee(String empname,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
{
super(empname,gender,address,age);
this.empid=empid;
this.company_name=company_name;
this.qualification=qualification;
this.salary=salary;
}
}
class Teacher extends Employee
{
int teacherid;
String dept,subject;
Teacher(String empname,String gender,String address,int age,int empid,String company_name,String qualification,int salary,int teacherid,String dept,String subject)
{
super(empname,gender,address,empid,age,company_name,qualification,salary);
this.teacherid=teacherid;
this.dept=dept;
this.subject=subject;
}
void display()
{
System.out.println("\n EMPLOYEE ID		: "+empid);
System.out.println("\n EMPLOYEE NAME		: "+empname);
System.out.println("\n AGE OF THE EMPLOYEE	: "+age);
System.out.println("\n GENDER		: "+gender);
System.out.println("\n ADDRESS		: "+address);
System.out.println("\n QUALIFICATION		: "+qualification);
System.out.println("\n COMPANY NAME		: "+company_name);
System.out.println("\n TEACHER ID		: "+teacherid);
System.out.println("\n DEPARTMENT		: "+dept);
System.out.println("\n SUBJECT TAKEN		: "+subject);
System.out.println("\n SALARY			: "+salary);
}
}
public class InheritanceOfThree
{
public static void main(String[] args)
{
int i,n;
int age,salary,empid;
int teacherid;
String empname,dept,company_name,subject,address,qualification,gender;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("\n How much records you need to insert ? ");
n=Integer.parseInt(br.readLine());
Teacher ob1[]=new Teacher[n];
i=0;
while(i<n)
{
System.out.println("\n Enter details of teacher "+(i+1)+":\n");
System.out.println("\n Enter employee id : ");
empid=Integer.parseInt(br.readLine());
System.out.println("\n Enter teacher id: ");
teacherid=Integer.parseInt(br.readLine());
System.out.println("\n Enter name of teacher : ");
empname=br.readLine();
System.out.println("\n Enter age : ");
age=Integer.parseInt(br.readLine());
System.out.println("\n Enter gender : ");
gender=br.readLine();
System.out.println("\n Enter qualification: ");
qualification=br.readLine();
System.out.println("\n Enter subject name : ");
subject=br.readLine();
System.out.println("\n Enter the company name : ");
company_name=br.readLine();
System.out.println("\n Enter the residential address: ");
address=br.readLine();
System.out.println("\n Enter the name of the department: ");
dept=br.readLine();
System.out.println("\n Enter salary: ");
salary=Integer.parseInt(br.readLine());
ob1[i]=new Teacher(empname,gender,address,empid,age,company_name,qualification,salary,teacherid,dept,subject);
i++;
}
System.out.println("\n TEACHER'S INFORMATION\n");
for(i=0;i<n;i++)
{
ob1[i].display();
}
}
catch(Exception e)
{
}
}
}

