import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Chef{
    int  guitarCount(int array[],int n){
        int result=0;
        for(int i=0;i<(n-1);i++){
            int first=array[i];
            int second=array[i+1];

            if(second>=first){
                result+=(second-first)-1;
            }
            if(second<=first){
                result+=(first-second)-1;
            }

        }
        return result;

    }
    

    
    public static void main(String[] args)throws Exception{
        Chef c=new Chef();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(bufferedReader.readLine());

        while(test--!=0){
            int n=Integer.parseInt(bufferedReader.readLine());
        String line[] = bufferedReader.readLine().split(" ");
    
        final int river[] = new int[line.length];
        for (int i = 0; i < river.length; i++) {
            river[i] = Integer.parseInt(line[i]);
        }
        System.out.println(c.guitarCount(river, river.length));
        
    }
}
}