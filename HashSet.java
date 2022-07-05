import java.util.*;

public class HashSet
{
    public static void main(String[] args) 
	{
        HashSet<Integer> hash1= new HashSet<>();
        hash1.add(4);    
        hash1.add(18);    
        hash1.add(44);   
        hash1.add(46);  
        hash1.add(19);  
        System.out.println("\nHashset 01 : ");
        Iterator<Integer> item1=hash1.iterator();  
        while(item1.hasNext())
            System.out.println(item1.next());  
            
        HashSet<Integer> hash2= new HashSet<>();
        hash2.add(32);    
        hash2.add(44);    
        hash2.add(19);   
        hash2.add(52);  
        hash2.add(12);  
        System.out.println("\nHashset 02 : ");
        Iterator<Integer> item2=hash2.iterator();  
        while(item2.hasNext())
            System.out.println(item2.next());  

        System.out.println("\nElements which present in hashset 1 and hashset 2 are : \n");
        for(Integer elem: hash1)
		{
            if(hash2.contains(elem))
                System.out.print(elem+"=> ");
        }
        System.out.println("\n");
    }
}
