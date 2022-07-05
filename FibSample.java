import java.util.Scanner;

class Fibonacci extends Thread{

    int size;
    Fibonacci(int size){
        this.size=size;
    }

    public void run(){
        int num1=0, num2=1;
        System.out.print("Fibonacci Series is::- 0,1,");
        for(int i=2;i<size;i++){
            int temp=num1;
            num1= num2;
            num2= temp+num1;
            System.out.print(num2+", ");
        }
    }
}

class Even extends Thread{
    int range;
    Even(int range){
        this.range= range;
    }

    public void run(){
        for(int i=0;i<range;i++){
            if(i%2==0){
                System.out.println(" The even number : "+i);
            }
        }
    }
}

public class FibSample
 {
    public static void main(String[] args) 
	{
        int size, range;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of fibonacci series : ");
        size= sc.nextInt();

        System.out.println("Enter the range of even numbers : ");
        range= sc.nextInt();

        Fibonacci fib= new Fibonacci(size);
        Even even= new Even(range);
        fib.start();
        even.start();

        sc.close();
    }
}
