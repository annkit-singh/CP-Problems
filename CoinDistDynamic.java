import java.util.Arrays;

public class DynamicDemo {
    // simple recursive approach with exponentital time complexity
    public int coinRequired(int array[],int n){
        if(n==0) return 0;
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(n-array[i]>=0){
                int subAns=coinRequired(array, n-array[i]);


                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        return ans;
    }
    // #dynamic approach
    public int coinRequiredDynamic(int array[],int n,int dp[]){
        if(n==0) return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(n-array[i]>=0){
                int  subAns=0;

                if(dp[n-array[i]]!=-1){
                  subAns=  dp[n-array[i]];
                }
                else{
                 subAns=coinRequiredDynamic(array, n-array[i],dp);
                }


                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        dp[n]=ans;
        return dp[n];
    }
    public static void main(String [] args){
        DynamicDemo d=new DynamicDemo();
        int array[]={1,5,7};
        int n=18;
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;
      System.out.println(  d.coinRequiredDynamic(array, n,dp));
            System.out.println(Arrays.toString(dp));
    }
}