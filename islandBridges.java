import java.util.*;


import java.io.*;
import java.lang.*;

class Graph{
    static Map<Integer,Set<Integer> > adjointMap= new HashMap<> ();

    public void  addEdge(Integer v1,Integer v2){
        if(adjointMap.containsKey(v1)){
            adjointMap.get(v1).add(v2);
        }
        else{
            adjointMap.put(v1,new HashSet<>());
            adjointMap.get(v1).add(v2);
        }
        if(adjointMap.containsKey(v2)){
            adjointMap.get(v2).add(v1);
        }
        else{
            adjointMap.put(v2,new HashSet<>());
            adjointMap.get(v2).add(v1);
        }
    }

    public Integer BFS( Map<Integer,Set<Integer> > adjointMap,int destination,int root){
        Queue<Integer> mainQueue=new ArrayDeque<>();
        mainQueue.add(root);
        Map<Integer,Integer> countMap=new HashMap<>();
        countMap.put(root, 0);
        while(!mainQueue.isEmpty()){
           Integer element= mainQueue.poll();
           for(Integer e:adjointMap.get(element)){
               if(countMap.containsKey(e)){
                   Integer weight=countMap.get(e);
                   if(weight>(countMap.get(element)+1)  ){
                       countMap.replace(e, weight, (countMap.get(element)+1) );
                       mainQueue.add(e);
                         }
                    else
                    continue;

               }
               else{
             countMap.put(e,countMap.get(element)+1 );
             mainQueue.add(e);
               }
             }
            }
        return countMap.get(destination);
    }
    public static void main(String [] args)throws Exception{
        Graph gr=new Graph();
        FastReader f=new FastReader();
        int t=f.nextInt();
        while(t--!=0){
            int array1[]=f.readintarray(2);
            int destination=array1[0];
            int noOfEdges=array1[1];
            int root=1;
            while(noOfEdges--!=0){
            int array2[]=f.readintarray(2);
            int first=array2[0];
            int second=array2[1];
            gr.addEdge(first, second);
            }
        System.out.println(gr.BFS(adjointMap, destination, root)); 
    }
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
     Integer [] readIntegerArray(int n) {
        Integer res [] = new Integer [n];
        for(int i = 0; i<n; i++)res[i] = nextInt();
        return res;
    }
     long [] readlongarray(int n) {
         long res [] = new long [n];
         for(int i = 0; i<n; i++)res[i] = nextLong();
         return res;
     }
     Long [] readLongArray(int n) {
        Long res [] = new Long [n];
        for(int i = 0; i<n; i++)res[i] = nextLong();
        return res;
    }
    }

}