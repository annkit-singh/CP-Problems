import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.io.*;

import java.util.*;

import java.lang.*;

 class Aankit {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        
        int [] readintarray(int n) {
        	int res [] = new int [n];
        	for(int i = 0; i<n; i++)res[i] = nextInt();
        	return res;
        }
    }
    public static void main (String[]  args) throws Exception{
       
        FastReader fr=new FastReader();
      
    
    int ar[]=fr.readintarray(3);
       
        
        int maxArea[]=fr.readintarray(3);
        Vector <int []> v=new Vector<int[]> ();
        
        int minAn_minareaH[]=fr.readintarray(2);
        int minAn_minareaC[]=fr.readintarray(2);
        int minAn_minareaA[]=fr.readintarray(2);
        int totalLand=fr.nextInt();
        v.add(minAn_minareaH);
        v.add(minAn_minareaC);
        v.add(minAn_minareaA);
       
        int med=0;

        int costly=Math.max(Math.max(ar[0],ar[1]), ar[2]);
        int cheap=Math.min(Math.min(ar[0],ar[1]), ar[2]);
        for(int i=0;i<ar.length;i++){
            if(ar[i]==costly){
                costly=i;
            }
           else if(ar[i]==cheap){
                cheap=i;
            }
            else if(ar[i]!=cheap && ar[i]!=costly)
             med=i;
            
        }
        int sum=0;

        for(int a:v.get(costly)){
            sum=a*a;
        }
 
int sum2=0;
   sum2+=maxArea[cheap];


int rem=totalLand-sum-sum2;

int finalSum=rem*ar[med] +sum*ar[costly] +sum2*ar[cheap];

System.out.println(finalSum);











        



    }


    
}