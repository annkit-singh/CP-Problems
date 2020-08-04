import java.util.*;
import java.io.*;
import java.lang.*;

class TestClass{
    // Implementation of ternary Search
    public int ternarySearch(int array[],int left,int right,int value){
        int mid1=left+(right-left)/2;
        int mid2=right-(right-left)/2;
        if(array[mid1]==value){
            return mid1;
        }
        if(array[mid2]==value){
            return mid2;
        }
        if(value<mid1){
            return ternarySearch(array, mid1+1, right, value);

        }
        else if(value>mid2){
            return ternarySearch(array, mid2+1, right, value);
        }
        else{
            return ternarySearch(array, mid1+1, mid2-1, value);
        }
    }

    // Function of which we want to find max or min value of x
    public double fun(double x){
        return (2*x*x)-(12*x)+7;
    }
    // Function to find the min value
    public double minFun(double left,double right){
        for(int i=0;i<200;i++){
            double m1=left+(right-left)/3;
            double m2=right-(right-left)/3;

            if(fun(m1)<fun(m2)){
            right=m2;
            }
            else
            left=m1;

        }
        double x=left;
        return fun(x);

    }
     // Function to find the max value
    public double maxFun(double left,double right){
        while((right-left)>1e-9){
            double m1=left+(right-left)/3;
            double m2=right-(right-left)/3;

            if(funMax(m1)<funMax(m2)){
           left=m1;
            }
            else
            right=m2;

        }
        double x=left;
        return funMax(x);

    }
    public static void main (String[] args) throws Exception{
        TestClass t=new TestClass();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(bf.readLine());
        while(test--!=0){
            String str[]=bf.readLine().split(" ");

        int left=Integer.parseInt(str[0]);
        int right=Integer.parseInt(str[1]);
        double d=  t.minFun(left, right);
        System.out.println(Math.round(d));
           

    }
}
}