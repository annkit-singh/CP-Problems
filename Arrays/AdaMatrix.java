import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {
public static void main(String[] args) throws Exception{
  Main m=new Main();
    UltraFast uf=new UltraFast();
    int cases = uf.nextInt();

    while (cases-- != 0) {
        int size=uf.nextInt();
        int array[]=uf.readintarray(size*size);

         boolean boolAr[]=new boolean [size];
         for(int i=0;i<size;i++){
           if(array[i]==i+1) boolAr[i]=true; 
           else  boolAr[i]=false;
         }
         int count=0;
         for(int i=size-1;i>=1;i--){
          if(boolAr[i]) continue;
          else {
              count++;
              for(int j=i;j>=1;j--){
                  boolAr[j]=(boolAr[j])?false:true;
                      }
                }
         }
         System.out.println(count);
}

}

static class UltraFast {
    BufferedReader br;
    StringTokenizer st;

    public UltraFast() {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        br = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    int[] readintarray(int n) {
        int res[] = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }

    Integer[] readIntegerArray(int n) {
        Integer res[] = new Integer[n];
        for (int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }

    long[] readlongarray(int n) {
        long res[] = new long[n];
        for (int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }

    Long[] readLongArray(int n) {
        Long res[] = new Long[n];
        for (int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
}
}
  