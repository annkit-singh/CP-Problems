import java.util.Arrays;
import java.util.*;
class CountInv{  
public static int countInvert(int array[]){
        int n=array.length;
        int count=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j])
                    count++;
            }
        }

        return count;
    }
    public static  int  mergeandCount(int array[],int left,int right,int mid){
        int L[]=Arrays.copyOfRange(array, left, mid+1);
        int R[]=Arrays.copyOfRange(array, mid+1,right+1);

         int i=0;int j=0;int k=left;
         int count=0;
        while(i<L.length && j<R.length){
            if(L[i]<R[j]){
                array[k++]=L[i++];
            }
            else{
                array[k++]=R[j++]; 
                count+=(mid+1)-(left+i);                                                                                                                        
            }
        }
        while(i<L.length){
            array[k++]=L[i++];

        }
        while(j<R.length){
            array[k++]=R[j++];       
        }
        return count;
    }

    public static int divide(int array[],int left,int right){
        int count=0;
        if(left<right){
            int mid=(right+left)/2;
            count+=divide(array,left,mid);
            count+=divide(array,mid+1,right);
            count+=mergeandCount(array, left, right, mid);
        }

        return count;
   
    }

public static void main(String[] args){
int array[]={4,3,2,1,5,9};
int r=divide(array,0,array.lenght-1);
System.out.println(r);
}}











