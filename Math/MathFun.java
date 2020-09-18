import java.util.*;

 class MathFun {
    
    public int binaryExponent(int x,int n){
        if(n==0)
        return 1;
        else if(n%2==0)
            return binaryExponent(x*x,n/2);
        
        else
        return x*binaryExponent(x*x,(n-1)/2);
    }

    public int modularExponent(int x,int n,int M){
        if(n==0)
            return 1;
        else if(n%2==0){
            return modularExponent((x*x )%M,n/2, M);
        }
        else 
        return (x*modularExponent((x*x)%M, (n-1)/2, M))%M;

    }

    public int euclidGcd(int a,int b){
        if(b==0)
            return a;
        else
        return euclidGcd(b, a%b);
    }

    int x=0;int y=0;int d;
public void euclidGcdExtended(int a,int b){
    if(b==0){
        d=a;
        x=1;
        y=0;
    }
    else{
        euclidGcdExtended(b, a%b);
        int temp=x;
        x=y;
        y=temp-(a/b)*y;
    }
}
public int naiveInverse(int a,int m){
    a=a%m;
    for(int b=1;b<m;b++)
      if ((a*b)%m==1)
          return b;

          return 1;
}


// works only when m is a prime
public int modinverse (int a,int m){
    return modularExponent(a, m-2, m);
}

static int modInverse(int a, int m) 
    { 
        int m0 = m; 
        int y = 0, x = 1; 
  
        if (m == 1) 
            return 0; 
  
        while (a > 1) 
        { 
           
            int q = a / m; 
  
            int t = m; 
  
            
            m = a % m; 
            a = t; 
            t = y; 
  
            y = x - q * y; 
            x = t; 
        } 
  
        if (x < 0) 
            x += m0; 
  
        return x; 
    } 



    public boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;

            }
        }
            return true;
        
    }
    public int totientFuntion(int N){
        int count=0;
        for(int i=0;i<=N;i++){
            if(euclidGcd(i, N)==1){
                count++;
            }

        }
        return count;

    }
   public HashSet<Integer> printPrimeFactors(int n){

        HashSet <Integer> hs=new HashSet<>();
        while(n%2==0){
            hs.add(2);
            n=n/2;

        }
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            while(n%i==0){
                hs.add(i);
                n=n/i;

            }
        }
        if(n>2){
            hs.add(n);
        }
        return hs;
    }

    public HashSet<Integer> printAlldivisors(int  n){
 HashSet <Integer> hs=new HashSet<>();
        for(int i=1;i<=Math.sqrt(n);i++  ){
            if(n%i==0){
                if (n/i==i){
                hs.add(i);
                }
                else{
                    hs.add(i);
                    hs.add(n/i);
                }
        }
    }
        return hs;
    }


    public HashSet<Integer> primeFromSeive(int n){
        HashSet<Integer> hs = new HashSet<>();
    for(int i=2;i<=Math.sqrt(n);i++){
        while(n%i==0){
            hs.add(i);
            n=n/i;

        }
    }
    if(n!=1){
        hs.add(n);
    }
    return hs;

    }

    public HashSet<BigInteger> factorizationBig(BigInteger n) {
        HashSet<BigInteger> v = new HashSet<BigInteger>();
        BigInteger i = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");

        while (i.compareTo(n.sqrt()) <= 0) {

            while (n.mod(i).compareTo(zero) == 0) {
                v.add(i);
                n = n.divide(i);

            }
            i = i.add(one);
        }

        if (!n.equals(one)) {
            v.add(n);
        }
        return v;
    }

  
   
   


    void  segmentSieve(int left, int right){
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
    
    public static void main(String [] args){
        MathFun m=new MathFun();
        m.segmentSieve(10, 50);
    //    System.out.println(m.modularInverse(5, 12));

    //    System.out.println(n);

      
    //    System.out.println( m.binaryExponent(3,3));

    //   System.out.println( m.modularExponent(2,3,5));
    //   System.out.println(m.Euclidgcd(, b));
    }
}
