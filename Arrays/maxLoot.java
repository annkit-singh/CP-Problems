import java.util.Arrays;
import java.util.Scanner;
 class Demo3 {
public int maxLoot(int array[],int  n){
    int another[]=new int[n];
    another[0]=array[0];
    another[1]=Math.max(array[1], array[0]);

    for(int i=2;i<n;i++){
        another[i]=Math.max(another[i-2]+array[i], another[i-1]);
    }

    return another[n-1];
}


public static void main(String[] args){
Demo3 d=new Demo3();

int array[]={6,5,3,2,4};
int n=array.length;
int maxLoot=d.maxLoot(array,n);
System.out.println(maxLoot);