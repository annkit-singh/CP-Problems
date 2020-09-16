import java.util.*;
import java.io.*;
import java.lang.*;
import java.nio.charset.StandardCharsets;
class InputOutput{
    public static void main(String [] args)throws IOException{
        // FOR INPUTS
//   FOR USING BUFFEREDINPUTSTREAM  for this import java.nio.charset.StandardCharsets; is necessary
//  0.28sec

        BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedReader r = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
        // Buffered reader for converting the bytes into charset

        int intInput=Integer.parseInt(r.readLine());
        System.out.println("Integer :"+intInput);
        String st=r.readLine();
        System.out.println("String :"+st);
        double d=Double.parseDouble(r.readLine());
        System.out.println("Double :"+d);
   
        // THIS CAN BE USED FOR ARRAY INPUT
        String sAr[]=r.readLine().trim().split(" ");
        int array[] = new int[sAr.length];
        for(int i=0;i<array.length;i++){
            array[i]= Integer.parseInt(sAr[i]);
        }


// BY USING BUFFERERD READER FOR SINGLE INPUT  
// 0.29sec
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int  intInput=Integer.parseInt(bf.readLine());
        System.out.println(intInput);
// FOR ARRAY 
        String str[]=bf.readLine().trim().split(" ");
        int array[]=new int[str.length];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(array));

// ********************************************************************************************************************************
// OUTPUT 
PrintWriter pw = new PrintWriter(System.out);

PrintStream ps = new PrintStream(System.out);

try {
    ps.println("We are here");
    ps.println("Hello World");
    ps.println(98);
}
catch (Exception e) {
    e.printStackTrace();
}
finally {
    ps.close();  //close or flush is necessary when we are using PrintWriter or PrintStream
    ps.flush();

}

// WITHOUT Try Catch 
PrintWriter p = new PrintWriter(System.out);

p.println("Hello World");
p.flush();

PrintStream ps = new PrintStream(System.out);
ps.println("This is printStream"); // for this close is not mandatory it can run without flush or close too
                                   // using close or flush is a good practice
ps.flush();
ps.close();  

// Apart from these there is also another 1 
System.out.println();

      
    }
}

//Separate UltraFast
 import java.nio.charset.StandardCharsets;
class UltraFast {
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

   
    

