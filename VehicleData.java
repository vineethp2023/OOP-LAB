import java.util.*;
class Vehicle
{
	String type;
	String name;
	String no;
	String color;
	String model;
	double mileage;
	
	Vehicle(String type,String name,String no,String color,String model,double mileage)
	{
		this.type=type;
		this.name=name;
		this.no=no;
		this.color=color;
		this.model=model;
		this.mileage=mileage;
	}
	void display_details()
	{
		System.out.println("\nTYPE: "+type);
		System.out.println("\n NAME: "+name);
		System.out.println("\n NUMBER: "+no);
		System.out.println("\n COLOR: "+color);
		System.out.println("\n MODEL : "+model);
		System.out.println("\n MILEAGE: "+mileage);
	}
}
public class VehicleData
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		Vehicle ob[]=new Vehicle[5];
		String type,name,no,model,color;
		double mileage;
		int i=0,n;
		System.out.println("\n Enter a limit: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("\n Enter the details of vehicle: "+(i+1)+" \n");
			System.out.println("\n type ? ");
			type=sc.nextLine();
			System.out.println("\n Enter the name of vehicle: \n");
			name=sc.nextLine();
			System.out.println("\n Enter the number of the vehicle\n");
			no=sc.nextLine();
			System.out.println("\n Enter the model name: ");
			model=sc.nextLine();
			System.out.println("\n Enter the color of vehicle: ");
			color=sc.nextLine();
			System.out.println("\n Enter the mileage: ");
			mileage=sc.nextDouble();
			sc.nextLine();
		    ob[i]= new Vehicle(type,name,no,color,model,mileage);
		}
		System.out.println("\n VEHICLE INFORMATION\n");
		System.out.println("\n=========================");
		for(i=0;i<5;i++)
			ob[i].display_details();
	}
}

		
			
			
			
			

	
	