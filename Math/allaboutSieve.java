import java.util.Vector;
import java.util.*;


class SieveAdvan{
    public Vector Factorizationof(int n){
        Vector<Integer> v=new Vector<Integer>();
        for(int i=2;i*i<=n;i++)
        if(n%i==0){
            v.add(i);
            n/=i;

        }

        if(n!=1){
            v.add(n);
        }
        return v;
    }


    int MAX=500;
    public static int []  MaxPrime(int n){
        int array[]=new int[n+1];
        Arrays.fill(array,0);
        for(int i=2;i*i<=n;i++){

            for(int j=i*i;j<=n;j=j+i)
            if(array[j]==0){
                array[j]=i;
            }

        }

        for(int i=2;i<=n;i++){
            if(array[i]==0){
                array[i]=i;
            }
        }
       return  array;

    } 

    public static Vector factorise(int n,int array[]){
        Vector v =new Vector<Integer>();
        while(n!=1){
            int val=array[n];
            v.add(val);
            n/=array[n];
        }

        return v;


    }

    void  segmentSieve(int right, int left){
        Boolean array[]=new Boolean[right-left+1];
        for(int i=2;i*i<=right;i++){
            for(int j=Math.max((i*i),(left +(i-1))/i*i);j<=right;j=j+i){
                array[j-left]=false;
            }

        }
    

        for(int i=0;i<array.length;i++){
            if(array[i]==null){
                System.out.print( (left+i) +"  ");
            }
        }
    }

    public static void main(String[]  args){
        SieveAdvan sa=new SieveAdvan();
        int left=20;
        int right=500000;
     sa.segmentSieve(right,left);
 
    
    }
    
}