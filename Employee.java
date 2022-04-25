import java.util.*;
public class Employee
{
	Scanner sc=new Scanner(System.in);
	int eNo;
	String eName;
	int eSal;
	
	void read_emp()
	{
		System.out.println("\n Enter employee number: ");
		eNo=sc.nextInt();
		sc.nextLine();
		System.out.println("\n Enter employee name: ");
		eName=new String(sc.nextLine());
		System.out.println("\n Enter salary of employee: ");
		eSal=sc.nextInt();
	}
	void print_emp()
	{
		System.out.println("\n Employee Information\n");
		System.out.println("\n EMPLOYEE NO. : "+eNo);
		System.out.println("\n EMPLOYEE NAME: "+eName);
		System.out.println("\n SALARY 		: "+eSal);
	}
	public static void main(String[] args)
	{
		int n,i,key;
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n How many records you have to save\n");
		n=sc.nextInt();
		Employee ob[]=new Employee[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new Employee();
			System.out.println("\n ENTER DETAILS OF EMPLOYEE "+(i+1));
			ob[i].read_emp();
		}
		do
		{
			System.out.println("\n Enter an employee number to be searched: ");
			key=sc.nextInt();
			if(key>=1 && key<=n)
			{
				for(i=0;i<n;i++)
				{
					if(ob[i].eNo==key)
						break;
					else
						continue;
				}
				System.out.println("\n INFORMATION OF EMPLOYEE HAVING EMPLOYEE NUMBER "+ob[i].eNo);
				ob[i].print_emp();
			}
			else
			{
				System.out.println("\n Record Not Found!!!Error.....");
			}
			System.out.println("\n Do you want to visit anymore records ? (1 for yes , 0 for No)");
			opt=sc.nextInt();
		}
		while(opt!=0);
	}
}
