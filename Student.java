import java.util.*;
public class Student
{
	int sid;
	String sname;
	double m1,m2,m3,tot,avg;
	Student(int id1,String name1,double ma1,double ma2,double ma3)
	{
		sname=name1;
		sid=id1;
		m1=ma1;
		m2=ma2;
		m3=ma3;
	}
	void calc_data()
	{
		tot=(m1+m2+m3);
		avg=tot/3;
	}
	void show_details()
	{
		System.out.println("\n STUDENT ID:\t"+sid);
		System.out.println("\n STUDENT NAME :\t"+sname);
		System.out.println("\n MARK OF SUBJECT 1:\t"+m1);
		System.out.println("\n MARK OF SUBJECT 2: \t"+m2);
		System.out.println("\n MARK OF SUBJECT 3: \t"+m3);
		System.out.println("\n TOTAL MARKS: \t"+tot);
		System.out.println("\n AVERAGE MARKS :\t"+avg);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String c;
		Student ob[]= new Student[3];
		String name;
		int id;
		double mark1,mark2,mark3;
		
		for(int i=0;i<=2;i++)
		{
		System.out.println("\n Enter the name of student "+(i+1)+":");
		    
		c=sc.nextLine();
		name=new String(c);
		System.out.println("\n Enter the Student Id of student "+(i+1)+":");
		id=sc.nextInt();
		System.out.println("\n Enter the marks of three subjects of student "+(i+1)+": ");
		mark1=sc.nextDouble();
		mark2=sc.nextDouble();
		mark3=sc.nextDouble();
		ob[i]=new Student(id,name,mark1,mark2,mark3);
		c=sc.nextLine();
		}
		System.out.println("\n STUDENT INFORMATION\n");
		System.out.println("\n========================");
		for(int i=0;i<=2;i++)
		{	
			ob[i].calc_data();
			ob[i].show_details();
		}
	}
}
	
		
		