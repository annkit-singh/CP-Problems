import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class tcs {

    public Vector primeNumbers(int num){
        Integer a[]=new Integer[num];
        Arrays.fill(a, 1);
        a[0]=0;
        a[1]=0;

        for(int i=2;i*i<num;i++){
            if(a[i]==1){
                for(int j=i*i;j<num;j+=i){
                    a[j]=0;
                }
            }}
        Vector v=new Vector();

    for(int i=0;i<num;i++){
            if(a[i]==1){
                v.add(i);
                
            }
        }
        return v;
    }

    Vector  segmentSieve(int right, int left){
        Vector v =new Vector<Integer>();
        Boolean array[]=new Boolean[right-left+1];
        for(int i=2;i*i<=right;i++){
            for(int j=Math.max((i*i),(left +(i-1))/i*i);j<=right;j=j+i){
                array[j-left]=false;
            }

        }
    

        for(int i=0;i<array.length;i++){
            if(array[i]==null)
                v.add(left+i);
                      
        }
        return v;
    }

    public ArrayList combinationsArray(Vector v){
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<v.size();i++){
            for(int j=0;j<v.size();j++){
                Integer cmb=Integer.parseInt(String.valueOf(v.get(i))+String.valueOf(v.get(j)));
                if(!al.contains(cmb))
                al.add(cmb);
            }
        }
        Collections.sort(al);

        return al;
    }

    public ArrayList fibanocci(Integer a ,Integer b,Integer count){
        ArrayList <Integer> myar=new ArrayList<Integer>();
        myar.add((int)a);
        myar.add((int)b);

        // System.out.print(a+" "+b);
        for(Integer i=0;i<=count;i++){
            Integer c=a+b;
            myar.add((int)c);
           
            a=b;
            b=c;
        }
        return myar;
    }

    public boolean primeCheck(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i*i==num)
                    count++;
                else
                count+=2;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    
    public long printFiba(long a,long b,long upto){
        ArrayList<Long> ao=new ArrayList<Long>();
        ao.add(a);
        ao.add(b);
        int count=2;
        long c=0;
        while(count<=upto){
            c=a+b;
            ao.add(c);
            a=b;
            b=c;
            count++;
            
        }
       return ao.get(ao.size()-1);
    }


    public static void main(String[] args){
        tcs t=new tcs();
    t.printFiba(23, 3719, 34);
        
        System.out.println("Segment ----------------->");
        System.out.println(t.segmentSieve(40,2));
        System.out.println("Combination ------------------>");
        System.out.println( t.combinationsArray(t.segmentSieve(70,30)));
       
   ArrayList <Integer>fina= t.combinationsArray(t.segmentSieve(70,30));
   ArrayList primeList=new ArrayList<Integer>();
   for(int i=0;i<fina.size();i++){
       if(t.primeCheck(fina.get(i))){
        primeList.add(fina.get(i));

   }
}
System.out.println("PrimeList--------------------->");
System.out.println(primeList);

   int count=primeList.size()-1;
   
  Integer a=(Integer)primeList.get(0);
  Integer b=(Integer)primeList.get(count);
  System.out.println("Fibanocci ---------------->");
//  System.out.println(t.printFiba(a, b, count).toString());
//  ArrayList andr=t.fibanocci(a, b, count);
//  System.out.println("Answer is :"+andr.size());
System.out.println(t.printFiba(a, b, count));



    }


    
}