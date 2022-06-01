import java.util.Scanner;
class Employee
{
	int EmpId;
	String EmpName;
	double Salary;
	String Address;
	
	Employee(int empid,String empname,double salary,String address)
	{
		EmpId=empid;
		EmpName=empname;
		Salary=salary;
		Address=address;
	}
}
class Teacher extends Employee
{

	String deptname,subject;
	Teacher(int empid,String empname,double salary,String address,String deptname,String subject)
	{
		super(empid,empname,salary,address);
		this.deptname=deptname;
		this.subject=subject;
	}
	void display()
	{
		System.out.println("\n EMPLOYEE INFORMATION\n");
		System.out.println("\n EMPLOYEE ID	: "+EmpId);
		System.out.println("\n NAME			: "+EmpName);
		System.out.println("\n ADDRESS		: "+Address);
		System.out.println("\n SALARY		: "+Salary);
		System.out.println("\n DEPARTMENT   : "+deptname);
		System.out.println("\n SUBJECT TAUGHT	: "+subject);
	}
}
public class InheritanceSample
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String empname,address;
	double salary;
	int empid;
	int i,n;
	String dept,subject;
	Teacher[] ob;
	
	System.out.println("\n How many records you want to insert  ? ");
	n=sc.nextInt();
	ob=new Teacher[n];
	System.out.println("\n Enter details of "+n+" employees \n");
	for(i=0;i<n;i++)
	{		
		System.out.println("\n ENTER ID OF EMPLOYEE "+(i+1)+":");
		empid=sc.nextInt();
		sc.nextLine();
		System.out.println("\n ENTER NAME OF THE EMPLOYEE : "+(i+1)+":");
		empname=sc.nextLine();
		System.out.println("\n ENTER ADDRESS OF EMPLOYEE "+(i+1)+":");
		address=sc.nextLine();
		System.out.println("\n ENTER THE SALARY OF EMPLOYEE "+(i+1)+":");
		salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("\n ENTER THE DEPARTMENT OF THE EMPLOYEE: ");
		dept=sc.nextLine();
		System.out.println("\n ENTER THE SUBJECT TAUGHT BY THE EMPLOYEE(TEACHER): ");
		subject=sc.nextLine();
		ob[i]=new Teacher(empid,empname,salary,address,dept,subject);
	}
	System.out.println("\n INFORMATION OF ALL EMPLOYEES\n");
	for(i=0;i<n;i++)
		ob[i].display();
}
}
		
		
		
		
		
	