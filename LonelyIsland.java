import java.util.*;
import java.io.*;

class OurGraph{
	Map<String ,List<String>> adjVertix=new HashMap<String ,List<String>>();
	void addVertex(String label) {
        adjVertix.putIfAbsent(label,new LinkedList<String>());
    }
	
	void addEdge(String label1,String label2) {
		
		adjVertix.get(label1).add(label2);

		}

		public static void main(String [] args) throws Exception{
			OurGraph g=new OurGraph();
			FastReader f=new FastReader();
			int ar1[]=f.readintarray(3);
			int noV=ar1[0];
			int noE=ar1[1];

			
			for(int i=1;i<=noV;i++){
				g.addVertex(String.valueOf(i));

			}
			String presentInd=String.valueOf(ar1[2]);
			while(noE--!=0){
				int arra[]=f.readintarray(2);
				int l1=arra[0];
				int l2=arra[1];
			g.addEdge(String.valueOf(l1), String.valueOf(l2));

			}
			
			

			for(String s:	g.adjVertix.get(presentInd)){
			

			if(	g.adjVertix.get(s).isEmpty()){
			System.out.println(s);
			break;
				}
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
        long [] readlongarray(int n) {
        	long res [] = new long [n];
        	for(int i = 0; i<n; i++)res[i] = nextLong();
        	return res;
        }
    }

}