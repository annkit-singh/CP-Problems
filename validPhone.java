
import java.util.*; 
import java.lang.*;
import java.io.*;

class TestClass{
    public boolean isValid(String s){
        if((int)s.charAt(0)==48)
        return false;

        if(s.length()<=10){
              
        char [] c=s.toCharArray();
        int cout=0;
        for(int ele:c){
            if(ele>47 && ele<58){
               cout++;
            }
            if(cout==10){
                return true;
            }
        }
    }
        return false;
    }
    public static void main(String [] args) throws Exception{
        TestClass t=new TestClass();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(bf.readLine());
        while(test--!=0){
        String s=bf.readLine();
       
       
        
       System.out.println(t.isValid(s)?"YES":"NO");


    }
}
}