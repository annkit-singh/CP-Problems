import java.util.Arrays;
import  java.util.*;
import java.lang.*;
import java.io.*;

class Position{
    int row;int col;

public Position(int row,int col)
{
this.row=row;
this.col=col;

}
}
public class nQueens {
  

    public Position[] finalSolve(int n){
        Position [] posit=new Position[n];
        if(initialSolve(n, 0, posit))
            return posit;

        else
        return new Position[0];
    }

    public boolean initialSolve(int n,int row,Position [] p){
        if(n==row){
            return true;
        }

        int col;
        for( col=0;col<n;col++){
            boolean safe=true;


            for(int queens=0;queens<row;queens++){
                if(p[queens].col==col || p[queens].row -p[queens].col==row-col ||  p[queens].row +p[queens].col==row+col ){
                    safe=false;
                    break;
                } 
            }
            if(safe){
                p[row]=new Position(row, col);
            
            if(initialSolve(n, row+1, p))
                return true; 
            }
        }
            return false;
            }

            public static void main(String[]  args){
                nQueens nq=new nQueens();
                FastReader fast=new FastReader();
      int n=fast.nextInt();

       int array [][]=new int[n][n];
       if(nq.finalSolve(n).length>0)
       System.out.println("YES");
    
       else
       System.out.println("NO");
    


       for(Position p:  nq.finalSolve(n) ){
           for(int i=p.row;i<=p.row;){
            array[i][p.col]=1;
            i++;
           }        
}
       for(int ar[]:array){
           for(int l:ar){
               System.out.print(l+" ");
           }
           System.out.println();
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
    }
}


    



