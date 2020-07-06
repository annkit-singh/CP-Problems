import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
class Test{
    public Boolean FeolitePrimarility(int N){
        for(int k=0;k<N-1;k++){
            if((Math.pow(N/2, N-1)%N)!=1)
            return false;
        }
        return true;
    }

    public int modularExponen(int a,int x){
        if(x==0)
            return 1;
        
        else if(x==1)
          return a;
        else if(x%2==0)
            return modularExponen(a*a, x/2);
        
        else 
        return modularExponen(a*a, (x-1)/2);
    }

    public int modExponentiation(int x, int y,int p){
     
       int res=1;
       x=x%p;
       while(y>0){

        if((y&1)==1){
            res=(res*x)%p;

        }
        y=y>>1;
        x=x*x%p;
       }

       return res;

    }


    public Boolean isPrime(int num,int k){
        if(num==0 || num==1 )
            return false;
        

        if(num==2 ||num==3)
        return true;

        while(k>0){
            Random r=new Random();
            int a = 2+r.nextInt(5); 
            System.out.println("A :"+a);
            if(modExponentiation(a,num-1, num)!=1)
                    return false;
            k--;
        }
            return true;
        }

    

        public static int modPower(int a,int p,int m){
            if(p==0){
                return 1%m;

            }

            int u=modPower(a, p/2, m);
            u=(u*u)%m;


            if(p%2==1){
                u=(a*u)%m;
            }
            return u;
        }


        public boolean feoliteTest(int m,int k){

            while(k>0){
                Random r=new Random();
                int a=2+r.nextInt(5);
                if(modPower(a, m-1, m)==1){
                    return true;
                }
                k--;

            }
            return false;

        }
        public static int Fibanocci(int n){
            if(n==1 || n==2)
            return 1;

            return Fibanocci(n-1)+Fibanocci(n-2);
        }

       static boolean evenNumber(int n){
            if(n%2==0)
            return true;
            else
            return false;
        }

        public static boolean ThreeOrFive(int n){
            if(n%3==0 || n%5==0){
                return true;

            }
            return false;
        }

        public int summation(){
            int multi=0;
            for(int i=1;Fibanocci(i)<10;i++){
               if(ThreeOrFive(Fibanocci(i))){
                   multi+=i;
               }
                }

                return multi;
            }

            public int multi(int n){
                int i=2;
                int multi=0;
                while(i<n){
                    if(i%3==0 ){
                        multi+=i;
                    }
                    i++;

                }
                return multi;
            }
    

            public Vector factorization(float n){
                Vector<Float> v=new Vector<Float>();
                for(float i=2;i*i<=n;i++){
                    if(n%i==0){
                        v.add(i);
                        n=n/i;

                    }

                    
                }
                if(n!=1){
                        v.add(n);
                    }
            return v;
            }
            public float totientFuntion(float n,Vector<Float> v){
                float product=n;
                Iterator<Float> iter=v.iterator();
                while(iter.hasNext()){
                    product*=(1-(1/iter.next()));


                }
                return product;



            }
public Vector Factor(int n){
    Vector<Integer> v=new Vector<Integer>();
         for(int i=2;i*i<=n;i++){
         if(n%i==0){
            v.add(i);
            n/=i;
            }
            }
    if(n!=1){
    v.add(n);
    }
    return v;
}
public static String interChange(String a,int f,int s){
    char array[]=a.toCharArray();
    char t=array[f];
    array[f]=array[s];
    array[s]=t;

    return String.valueOf(array);
}


public void permuteString(String s,int l,int r){
    if(l==r){
        System.out.println(s);
    }

    for(int i=l;i<=r;i++){
        s=interChange(s, i, l);
        permuteString(s, l+1, r);
        s=interChange(s, i, l);

    }

}


public static int binaryCoefficient(int n,int k){
    if(k<(n-k))
        k=(n-k);


        int res=1;
        for(int i=0;i<k;i++){
            res*=(n-i);
            res/=(i+1);

        }
        return res;
    
}

public void pascalTriangle(int n){

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            int r=binaryCoefficient(i, j);
            System.out.print(r+" ");
        }
        System.out.println();
    }
}


public void PascalTriangleMatrix(int n){
    int array[][]=new int[n+1][n+1];
    for(int line=1;line<=n;line++){
        for(int j=1;j<=line;j++){
            if(j==line || j==1)
                array[line][j]=1;

            else
            array[line][j]=array[line-1][j-1]+array[line-1][j];
            
            System.out.print(array[line][j]+" ");
        }
        System.out.println();
    }
}


public void optimisePascal(int n)
{
    for(int line=1;line<=n;line++){
        System.out.print(line+" row: ");
        int c=1;

        for(int j=1;j<=line;j++){
            
            System.out.print(c+"  ");

            c=(c*(line-j))/j;


        }
        System.out.println();
    }
}

static void  segmentSieve(int right, int left){
    Boolean array[]=new Boolean[right-left+1];
    Arrays.fill(array, true);
    for(int i=2;i*i<=right;i++){
        for(int j=Math.max(i * i, (left + (i - 1)) / i  * i);j<=right;j=j+i){
            array[left-j]=false;
        }

    }


    for(int i=0;i<array.length;i++){
        if(array[i]==null){
            System.out.print( (left+i) +"  ");
        }
    }
}

    public static void main(String []  args) throws IOException{
        segmentSieve(0, 10);
   
    
        
    }
    }
