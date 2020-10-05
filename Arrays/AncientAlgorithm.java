import java.util.*;
import java.lang.*;
import java.io.*;

class Test1 {

public ArrayList <Integer> ancientAlgorithm(Integer n,ArrayList<Integer> al,Integer array[],char[] S){

        for(int i=0;i<S.length;i++){
            if(S[i]=='R'){
                List temp1=al.subList(0, i);
                List temp2=al.subList(i, al.size());
             Collections.reverse(temp2);
               List<Integer> al2=new ArrayList<Integer>();
               al2.addAll(temp1);
               al2.addAll(temp2);

               al=(ArrayList<Integer>)al2;
            }
            else if(S[i]=='A'){
               for(int k=i;k<al.size();k++){
                   Integer value=al.get(k);
                  value= value+array[0];
                  al.set(k ,value);
               }
                }
            else if(S[i]=='M'){
                for(int l=i;l<al.size();l++){
                    Integer value=al.get(l);
                   value= value*array[1];
                   al.set(l, value);
                    }
                }
            }
            return al;

        }
        public void finalprint(Integer n,Integer array[]){
            Integer mod=n%array[2];
  
            System.out.print(mod+" ");
        }

    public static void main(String[] args) throws Exception {
        Test1 t=new Test1();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        int  testCase=Integer.parseInt(bf.readLine());

        while(testCase--!=0){

     

            Integer  n=Integer.parseInt(bf.readLine());


        String str[]=bf.readLine().split(" ");

        Integer array[]=new Integer[n];

        for(int i=0;i<array.length;i++){

            array[i]=Integer.parseInt(str[i]);
        }

        String str2[]=bf.readLine().split(" ");

        Integer array2[]=new Integer[3];

        for(int i=0;i<array2.length;i++){

            array2[i]=Integer.parseInt(str2[i]);
        }
        String str3=bf.readLine();
        


        ArrayList<Integer> al=new ArrayList<Integer>();
        
        Collections.addAll(al,array);
    
        char S[]=str3.toCharArray() ;
      ArrayList<Integer> newList=  t.ancientAlgorithm(n, al, array2, S);  

      newList.forEach((nw)->t.finalprint(nw,array2));
      System.out.println();

      



        bf.close();
        pr.close();
    }

    }

}