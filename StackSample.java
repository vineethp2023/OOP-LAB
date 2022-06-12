import java.util.*;
public class StackSample
{
public static void main(String args[])
{
int n,opt;
StackOperations ob=new StackOperations();
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter the size of the stack\n");
n=sc.nextInt();
ob.stack=new int[n];
do
{
System.out.println("\n SELECT AN OPTION\n");
System.out.println("\n 1. PUSH \n");
System.out.println("\n 2. POP\n");
System.out.println("\n 3. DISPLAY\n");
System.out.println("\n 4. EXIT\n");
opt=sc.nextInt();
switch(opt)
{
case 1: ob.push(n);
		break;
case 2: ob.pop();
		break;
case 3: ob.display();
		break;
case 4: System.exit(0);
}
}
while(opt!=4);
}
}
class StackOperations
{
int item;
int top=-1;
int[] stack;
Scanner sc=new Scanner(System.in);
void push(int n)
{
if(top>=n-1)
System.out.println("\n Stack Overflow..!");
else
{
System.out.println("\n Enter an item\n");
item=sc.nextInt();
top++;
stack[top]=item;
}
}
void pop()
{
if(top==-1)
System.out.println("\n Stack Underflow\n");
else
{
System.out.println("\n item "+stack[top]+" is poping out...!");
top--;
}
}
void display()
{
	int i=top;
	if(top==-1)
		System.out.println("\n Stack is empty\n");
	else
	{
	System.out.println("\n The elements in the stack are\n");
	for(i=0;i<=top;i++)
		System.out.print(stack[i]+"\t");
	}
}
}



