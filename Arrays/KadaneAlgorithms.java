import java.util.Arrays;

public class Kadane {

    public int KadaneAlgo(int array[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currSum+=array[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
          if(currSum<0){
                currSum=0;
            }
             }
             return maxSum;
    }
    public static void main(String [] args){
        Kadane k=new Kadane();


        int arr[]={-3,2,4,-1,2,3,-2};
   System.out.println(k.KadaneAlgo(arr));
       
    }
    
}
