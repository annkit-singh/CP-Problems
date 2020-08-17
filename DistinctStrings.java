import java.io.*;

import java.util.*;

import java.lang.*;
public class Test{

    
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

    public  int CountPair(int n, int sum,int arr[]) 
    { 
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer,Integer>(); 
        for (int i=0; i<n; i++){ 
            if(!tmap.containsKey(arr[i])) 
                tmap.put(arr[i],0); 
                  
            tmap.put(arr[i], tmap.get(arr[i])+1); 
        } 
        int doubleCount = 0; 

        for (int j=0; j<n; j++) 
        { 
            if(tmap.get(sum-arr[j]) != null) 
                doubleCount += tmap.get(sum-arr[j]); 

            if (sum-arr[j] == arr[j]) 
                doubleCount--; 
        } 
        return doubleCount/2; 
    } 

    public int vowelCount(String str){
        int count=0;
        char[] carray=str.toCharArray();
        for(char c:carray){
            if(c==97 || c==101  || c==105 || c==111 || c==117){
                count++;
            }
        }
        return count;
    }
       public static void main(String[]  args) throws Exception{
       
        String arrayM[]= {"zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twentyone",
        "twentytwo",
        "twentythree",
        "twentyfour",
        "twentyfive",
        "twentysix",
        "twentyseven",
        "twentyeight",
        "twentynine",
        "thirty",
        "thirtyone",
        "thirtytwo",
        "thirtythree",
        "thirtyfour",
        "thirtyfive",
        "thirtysix",
        "thirtyseven",
        "thirtyeight",
        "thirtynine",
        "forty",
        "fortyone", "fortytwo",
        "fortythree",
        "fortyfour",
        "fortyfive",
        "fortysix",
        "fortyseven",
        "fortyeight",
        "fortynine",
        "fifty",
        "fiftyone",
        "fiftytwo",
        "fiftythree",
        "fiftyfour",
        "fiftyfive",
        "fiftysix",
        "fiftyseven",
        "fiftyeight",
        "fiftynine",
        "sixty",
        "sixtyone",
        "sixtytwo",
        "sixtythree",
        "sixtyfour",
        "sixtyfive",
        "sixtysix",
        "sixtyseven",
        "sixtyeight",
        "sixtynine",
        "seventy",
        "seventyone",
        "seventytwo",
        "seventythree",
        "seventyfour",
        "seventyfive",
        "seventysix",
        "seventyseven",
        "seventyeight",
        "seventynine",
        "eighty",
        "eightyone",
        "eightytwo",
        "eightythree",
        "eightyfour",
        "eightyfive",
        "eightysix",
        "eightyseven",
        "eightyeight",
        "eightynine",
        "ninety",
        "ninetyone",
        "ninetytwo",
        "ninetythree",
        "ninetyfour",
        "ninetyfive",
        "ninetysix",
        "ninetyseven",
        "ninetyeight",
        "ninetynine",
        "hundred",
    };


       
        Test t=new Test();
       
        FastReader f=new FastReader();
       
        int  n=f.nextInt();
        int array[]=f.readintarray(n);
        Vector<String> strVec=new Vector<String>();
        for(int ele:array){
          
              strVec.add( arrayM[ele]);

           }
        
        // D is the vowelSum
        int D=0 ;
      for(String st:strVec){
         D+= t.vowelCount(st);
      }

      int fsum=t.CountPair(n,D, array);

      if(fsum>100){
        System.out.println("greater 100");
      }
      else{
         System.out.println(arrayM[fsum]);
      }
    //   out.close();

      


    //   System.out.println("Sum is :"+D);



      

    }
}