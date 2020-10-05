 import java.util.*;
 import java.lang.*;
 import java.io.*;
 class GFG {


    public boolean isValidConfiguration(long books[],long nob,long nos,long ans){
        int students=1;
        long current_pages=0;

        for(int i=0;i<nob;i++){
            if(current_pages+books[i]>ans){
                current_pages=books[i];
                students++;
                    if(students>nos)
                        return false;
                    
                 }
            else{
                current_pages+=books[i]; 
            }
        }
        return true;
    }

        public long BookBinarySearch(long books[],long nob,long nos){
            long total_pages=0;
            long s=0;
            long e=0;
            for(int i=0;i<nob;i++){
                total_pages+=books[i];
                s=Math.max(s, books[i]);
            } 
            e=total_pages;
            int finalAns=(int)s;
            while(s<=e){
                long mid=(s+e)/2;
                if(isValidConfiguration(books, nob, nos, mid)){
                    finalAns=(int)mid;
                    e=mid-1;
                }
                else
                    s=mid+1;
                
    
                }
                return finalAns;
            } 

        public static void main(String[] args) throws Exception{
            GFG g=new GFG();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int testcase=Integer.parseInt(br.readLine());
            while(testcase--!=0){
          long num = Long.parseLong(br.readLine()); //Number of books
          String s= br.readLine(); //String of books pages
          long arr[]= new long[(int)num];
          String[] s1 = s.split(" ");
          for(int i=0;i<num;i++)
      {
          arr[i]=Long.parseLong(s1[i]);
      }
          int students=Integer.parseInt(br.readLine());
          if(g.BookBinarySearch(arr,num,students)>0){
              
          
          System.out.println(g.BookBinarySearch(arr,num,students));
          }
          else{
           System.out.println("-1");
          }    
          }
      }
    
}