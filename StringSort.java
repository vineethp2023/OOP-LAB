import java.util.Arrays;
import java.util.Scanner;
public class StringSort
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string : \n");
      String str = sc.nextLine();
	  System.out.println("\n Entered String is : "+str);
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println("\n The sorted string is: "+new String(charArray));
   }
}