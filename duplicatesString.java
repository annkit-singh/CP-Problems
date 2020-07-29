import java.util.*; 
import java.lang.*;
import java.io.*;

class TestClass{
    public static void main(String [] args) throws Exception{
       BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
       String s=bf.readLine();
       char c[]=s.toCharArray();
       Vector h=new Vector<Character>();
       for(char j:c){
           if(!h.contains(j)){
            h.add(j);
           }
       }
       StringBuilder sb=new StringBuilder(h.capacity());
      Iterator itr=h.iterator();
      while(itr.hasNext()){
          sb.append(itr.next());

      }
      System.out.println(sb.toString());
      


    }
}