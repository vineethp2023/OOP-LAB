import java.util.*;
class StringManip
{
	String s1;
	String s2;
	int len;
	Scanner sc=new Scanner(System.in);
	String concat_string(String str1,String str2)
	{
	 return str1.concat(str2);
	}
	int countLength(String str1)
	{
	 return str1.length();
	}
	String caseConvert(String str1)
	{
	 if(str1.equals(str1.toUpperCase()))
		return str1.toLowerCase();
	 else
		return str1.toUpperCase();
	}
	String replaceSubstring(String str1,String str2,String str3)
	{
	 return str1.replace(str3,str2);
	}
	String sortString(String str1)
	{
	  char[] a=new char[str1.length()];
	  a=str1.toCharArray();
	  Arrays.sort(a);
	  str1=new String(a);
	  return str1;
	}
	int returnCharPos(String str1,char ch)
	{
	 return str1.indexOf(ch);
	}
}
public class StringManipulation
{
	public static void main(String args[])
	{
	 StringManip ob=new StringManip();
	 int opt;
	 String str1,str2,str3;
	 char ch;
	 Scanner sc=new Scanner(System.in);
	 do
	 {
	   System.out.println("\n 1. FIND AN INDEX OF A CHARACTER IN A STRING\n");
	   System.out.println("\n 2. CONCATENATE TWO STRINGS\n");
	   System.out.println("\n 3. REPLACE A SUBSTRING\n");
	   System.out.println("\n 4. SEE THE LENGTH OF A STRING\n");
	   System.out.println("\n 5. CONVERT THE CASE OF STRING\n");
	   System.out.println("\n 6. EXIT\n");
	   opt=sc.nextInt();
	   switch(opt)
	   {
		case 1:  sc.nextLine();
				 System.out.println("\n Enter a string : \n");
				 str1=sc.nextLine();
				 System.out.println("\n Enter a character to be searched: ");
				 ch=sc.next().charAt(0);
				 System.out.println("\n The character "+ch+" found at "+ob.returnCharPos(str1,ch)+" in the string "+str1);
				 break;
		case 2:  sc.nextLine();
				 System.out.println("\n Enter string 1: \n");
				 str1=sc.nextLine();
				 System.out.println("\n Enter string 2: \n");
				 str2=sc.nextLine();
				 System.out.println("\n After concatenating the above string, we get "+ob.concat_string(str1,str2));
				 break;
		case 3: sc.nextLine();
				System.out.println("\n Enter a string : ");
				str1=sc.nextLine();
				System.out.println("\n Enter a word:  ");
				str2=sc.nextLine();
				System.out.println("\n Enter a substring : ");
				str3=sc.nextLine();
				if(str1.contains(str3))
				System.out.println("\n Replacing "+str3+" with the word "+str2+" and the result is : "+ob.replaceSubstring(str1,str2,str3));
				else
				System.out.println("\n Substring do not match !!!\n");
				break;
		case 4: sc.nextLine();
				System.out.println("\n Enter a string : ");
				str1=sc.nextLine();
				System.out.println("\n The length of the string is : "+ob.countLength(str1));
				break;
		case 5: sc.nextLine();
				System.out.println("\n Enter a string to be converted: (Enter either in capital or not)");
				str2=sc.nextLine();
				if(str2.equals(str2.toUpperCase())==false && str2.equals(str2.toLowerCase())==false)
					System.out.println("\n Enter in correct format\n");
				System.out.println("\n The converted string is : "+ob.caseConvert(str2));
				break;
		case 6: System.exit(0);
		
		default: System.out.println("\n INVALID CHOICE !!!\n");
	   }
	 }
	 while(opt!=6);
	}
}
				
				

	  
	
		