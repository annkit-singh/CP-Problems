import java.util.*;

class Demo2{

    public void coinDist(int num){
        int five=0;
        int one=0;
        int two=0;
        five=(num-4)/5;

        if((num-five*5)%2==0)
            one=2;
        
        else 
       one =1;

        two=(num-five*5-one) /2;

        System.out.println("Five :"+five);
        System.out.println("Twos :"+two);
        System.out.println("Ones :"+one);


    }


    public static void main(String[] args){
    Demo2 d=new Demo2();

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    d.coinDist(n);
        

      
       
    }
}