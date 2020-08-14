import java.util.ArrayList;
import java.util.Vector;

public class ConsectiveSum {


    public static void main(String []args){

        int n=15;
        int array[]=new int[n+1];

        Vector <Integer> vec=new Vector<Integer>();
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j=j+i){
                array[j]=1;

            }
        }
        for(int i=2;i<n;i++){
            if(array[i]==0){
                vec.add(i);
            }
        }
// int sum=0;
final int count=0;
Vector <Integer> su =new Vector <Integer>();
        Integer sum=vec.get(0);
        for(int i=1;i<(vec.size());i++){
            sum+=vec.get(i);
            su.add(sum);
        }

        Vector <Integer> result =new Vector <Integer>();

        su.forEach(ele-> { if(vec.contains(ele)) result.add(ele) ;});


        System.out.println(result.size());
            


           

    }
    
}