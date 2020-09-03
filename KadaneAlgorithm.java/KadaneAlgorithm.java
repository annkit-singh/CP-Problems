import java.util.Arrays;

public class Kadane {

    public int KadaneAlgo(int array[]){
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<array.length;i++){
            curr+=array[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
             }
             return max;
    }
    public static void main(String [] args){
        Kadane k=new Kadane();


        int arr[]={-3,2,4,-1,2,3,-2};
   System.out.println(k.KadaneAlgo(arr));
       
    }
    
}