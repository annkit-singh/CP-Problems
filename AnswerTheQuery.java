import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Arrays;
import java.io.*;
import java.lang.*;

class Tango{
public int binarySearch(int array[],int low,int high,int value){
    while(low<=high){
        int mid=(low+high)/2;
        if(array[mid]==value){
        return mid;
            }
        else if(value<array[mid]){
            return binarySearch(array, low, mid-1, value);  
            }  
        else 
           return binarySearch(array, mid+1, high, value);
            
        }
        return -1;
}
    public static void main(String []  args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Tango tc=new Tango();
        int length=Integer.parseInt(bf.readLine());
        int array[]= new int[length];
        String str=bf.readLine();
        String strAr[]=str.split(" ");
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(strAr[i]);
        }
        Arrays.sort(array);


        int noOfQ=Integer.parseInt(bf.readLine());
        while(noOfQ--!=0){
            int query=Integer.parseInt(bf.readLine());
            System.out.println( tc.binarySearch(array, 0, array.length-1, query));
             } 
        }
       
    }
   
    