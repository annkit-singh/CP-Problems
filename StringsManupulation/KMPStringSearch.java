import java.util.*; 
import java.lang.*;
import java.io.*;

class TestClass{
    public boolean stringSimpleSearch(String text,String pattern) {
        char texta [] =text.toCharArray();
       char patterna [] =pattern.toCharArray();
       
       int i=0;
       int j=0;
       int k=0;
       
       while(i< texta.length && j< patterna.length)
        {
           if(texta[i]==patterna[j] ){
               i++;
               j++;	
           }
           else {
               j=0;
               k++;
               i=k;
               
               
           }
       }
           if(j==patterna.length){
               return true;
           }
           else
           return false;
   }
   

    public int []  tempar(char []pattern){
        int newar[]= new int [pattern.length];
        int index=0;
        int i;
        for(i=1;i<pattern.length;){
            if(pattern[i]==pattern [index]){
                newar[i]=index+1;
                index++;
                i++;
            }
            
            else
            {
                if(index!=0){
                    newar[i]=newar[index-1];

                }
                else{
                    i++;
                }
            }
        }
        return newar;
        

    }

    public int kmpSearch(char[] text,char[] pattern){
        int count=0;
        int [] array=new int[pattern.length];
        array=tempar(pattern);

        int i=0;
        int j=0;
        while(i<text.length && j< pattern.length){
            if(text[i]==pattern[j]){
                i++;
                j++;
            }
            else{
                if(j!=0)
                    j=array[j-1];
                
                else
                    i++;
                
            }
            if(j==pattern.length){
                count++;
                j=0;
            }

         
          }
      return count;
    }
    public static void main(String [] args) throws Exception{
        TestClass t=new TestClass();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String pattern=bf.readLine();
        String text=bf.readLine();

        System.out.println(t.kmpSearch(text.toCharArray(), pattern.toCharArray()));
        
       
        


    }
}