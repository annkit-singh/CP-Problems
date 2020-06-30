import java.util.*;
class Coin{
    public static int count(int n){
#Distribution for the coins of 1,2 & 5
        int chains[]={0,1,2,2,3,3,4,4,5,4,5};
        int count=0;
        if(n<=10){
            return chains[n];
        }
        
        int sub=n-10;
        int r=n%5;
        int req=5-r;
        sub+=req;
        int num=sub/5;
        count+=num;
        int remchain=n-sub;
        count+=chains[remchain];

        return count;
    }
        public static void main (String [] args){
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit from 1 to... ");
        int num=sc.nextInt();
        int r=count(num);
        System.out.println("Minimum coin required :"+r);
       
    }
}