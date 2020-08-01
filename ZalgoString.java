import java.util.*;
import java.io.*;
import java.lang.*;

class TestClass{

  public int [] ZArray(char input[]){
      int Z[]=new int[input.length];
      int left=0;
      int right=0;

      for(int k=1;k<input.length;k++){
          if(k>right){
              left=right=k;
              while(right<Z.length && input[right]==input[right-left]){
                  right++;
              }
              Z[k]=right-left;
              right--;
          }
          else{
              int k1=k-left;
              if(Z[k1]<right-k+1){
                  Z[k]=Z[k1];

              }
              else{
                  left=k;
                  while(right<input.length && input[right]==input[right-left]){
                    right++;
                }
                Z[k]=right-left;
                right--;

              }
          }
      }

      return Z;
  }

  public List<Integer> mainZalgo(char text[],char pattern[]){
      char newStr []=new char[text.length +pattern.length+1];
      int i=0;


      for(char c:pattern){
          newStr[i++]=c;  
      }
      newStr[i++]='#';
      
      for(char c:text){
        newStr[i++]=c;  
    }
    List <Integer> l=new ArrayList<Integer>();
    int Z[]=ZArray(newStr);
    for(i=0;i<Z.length ;i++){
        if(Z[i]==pattern.length){
            l.add(i-pattern.length);
        }
    }
    return l;

  }

  public static void main(String[] args) throws Exception{
      TestClass z=new TestClass();
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String pattern=bf.readLine();
    String text=bf.readLine();
    char []p=pattern.toCharArray();
   
     char []t=text.toCharArray();
   List <Integer> l=  z.mainZalgo(t, p);
   System.out.println(l.size());

     

  }
  
}