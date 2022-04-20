import java.util.*;
import java.lang.*;
import java.io.*;

class MapInput{
public static void main(String[] args) throws Exception
{
   

    Scanner sc=new Scanner(System.in);
    Map <String,String> hashmap=new HashMap<>();

    while(sc.hasNextLine()){
        String string=sc.nextLine();
        String stringArray [] =string.split(" ");
        String key=stringArray[0];
        String value=stringArray[1];

        hashmap.put(key, value);
    }

    for(Map.Entry<String,String> e: hashmap.entrySet()){
         System.out.println(e.getKey());
	System.out.println(e.getValue());
    }
}

}