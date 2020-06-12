import java.util.Scanner;
public class DevisibleSubset {
    public int prearray(int array[]){
        int newarr[]=new int[array.length+1];
        newarr[0]=1;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=newarr[i];
            sum%=array.length;
            sum=(sum+array.length)%array.length;
            newarr[sum]++;
        }

        int ans=0;
        for(int i=0;i<newarr.length;i++){
            int m=newarr[i];
            ans+=(m)*(m-1)/2;
        }
        return ans;
    }
  
       static int reserve=0;

    public static int  arrayFreq(int array[]){
        int n=array.length;
        // int reserve;
        // int sum=0;
        int [] at=new int[n];
        // at[0]=1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                
                sum=sum+array[j];
                sum%=n;
                if(sum==0){
                    reserve=j+1;
                    
                }
                at[sum]++;
                

            }

        }
       return at[0];
       
    }

    public static void main (String[] args){
        DevisibleSubset d=new DevisibleSubset();
        // Scanner sc=new Scanner(System.in);
        int array[]={1,3,2,6,4};
       int r= d.prearray(array);
       System.out.println(r);
    //    int result=arrayFreq(array);
    //    System.out.println(result);
    //    System.out.println(reserve);

    }
    }


    
