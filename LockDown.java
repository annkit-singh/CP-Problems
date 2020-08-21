import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LockDown {

    public Queue<Integer> lockDownGame(int mem,char[] cAr){
        Queue<Integer> q=new LinkedList<Integer> ();
        for (int i=1;i<=mem;i++){
            q.add(i);
        } 
        while(!(q.size()==1)){
            for(int i=0;i<cAr.length;i++){
                if(cAr[i]=='x'){
                Integer temp=q.poll();
                q.add(temp);
                }
                else if(cAr[i]=='y')
                q.remove();

                if(q.size()==1)
                break;
                        }
                        
                }
                return q;
            }


    public static void main(String[]  args){
        LockDown l=new LockDown();
        FastReader f=new FastReader();
        int n=f.nextInt();
        String str=f.next();
        char[] cAr=str.toCharArray();
        Queue<Integer> qu=l.lockDownGame(n, cAr);
        System.out.println(qu.element());


        
    }
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
        long [] readlongarray(int n) {
        	long res [] = new long [n];
        	for(int i = 0; i<n; i++)res[i] = nextLong();
        	return res;
        }
    }
}
    
