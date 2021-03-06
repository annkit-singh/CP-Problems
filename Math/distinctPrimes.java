import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

  class spoj {
     public  int distinctPrime(int n){
         int MAX=3000;
         Integer []prime=new Integer[MAX];
         Arrays.fill(prime, 0);

         Vector<Integer> result=new Vector<Integer>();

        for(int i=2;i<MAX;i++){
            if(prime[i]==0){
                prime[i]=1;
                for(int j=i*2;j<MAX;j=j+i){
                    prime[j]-=1;


                    if(prime[j]+3==0)
                        result.add(j);
                }
            }
        }
        Collections.sort(result);
        return result.get(n-1);
     }

     static int MAX = 100; 
  
    
     


     public static void main(String[] args) throws IOException{
        //  Scanner sc=new Scanner(System.in);
         spoj s=new spoj();

         BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

         int t=Integer.parseInt(bf.readLine());
         while(t--!=0){
         int n=Integer.parseInt(bf.readLine());
        System.out.println( s.distinctPrime(n));

         }

       


     
    
}
 }