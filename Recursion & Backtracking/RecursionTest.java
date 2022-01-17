import java.util.*;
public class RecursionTest {

    public static Integer countSequencesSumK(List<Integer> input,int ind,int n,int sum,int customSum){
        if(ind==n){
            if(customSum==sum)
            return 1;

            return 0;
        }
        
        return countSequencesSumK(input,ind+1,n,sum,customSum+input.get(ind)) +countSequencesSumK(input,ind+1,n,sum,customSum);

    }


    public static  void printName(int i,int n){
        if(i>n)
        return;
        System.out.println("aankit");
        printName(i+1, n);
    }

    public static  void printNumbers(int i,int n){
        if(n<i)
        return;
        System.out.println("Number is "+n);
        printNumbers(i, n-1);
    }

    public static void printBacktrack(int n,int i){ //i=3 n=3
        if(n<i)
        return;
        printBacktrack(n-1,i);
        System.out.println(n);
         
    }

    public static void printReverse(int i,int n){ //i=3 n=3
        if(i>n)
        return;
        printReverse(i+1,n);
        System.out.println(i);
         
    }
    public static int sumOfNnumbers(int n,int sum){
        if(n<1)
        return sum;
        else 
        return sumOfNnumbers(n-1,sum+n);
    }

    public static int funtionalRecursion(int n){
        if(n==1)
        return 1;
        else 
        return n*funtionalRecursion(n-1);
    }
    public static void swap(int one,int sec,int array[]){
        int temp=array[one];
        array[one]=array[sec];
        array[sec]=temp;
     }

    public static int funtionalRecursion(int n,int fact){
        if(n==1)
        return fact;
        else 
        return funtionalRecursion(n-1,fact*n);
    }
    public static int[] reverseArray(int []array,int l,int r){
        if(l==r ||l>r)
        return array;
        swap(l, r, array);

        return reverseArray(array, l+1, r-1);
    }
    public static String addBinary(String a, String b){
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuffer ans=new StringBuffer("");
        int carry=0;

        while(i>0 || j>0 || carry==1){
            if(i>=0)
            carry+=a.charAt(i)-'0';
            i--;

            if(j>=0)
            carry+=a.charAt(j)-'0';
            j--;

            ans.append(carry%2);
            carry=carry/2;

        }
        return ans.reverse().toString();
    }
    public static int nthFibanocci(int n,int array[]){
        
        if(n<=1){
            return n;
        }
        if(array[n-1]!=0){
            return array[n];
        }
        return array[n-1] = nthFibanocci(n-1,array)+nthFibanocci(n-2,array);
    }

   // print all sequences

    public static void subsequencesPrint(List<Integer> input,int ind,List<Integer> oLs){
        if(ind>=input.size()){
            System.out.println(oLs.toString());
            return ;
        }

        oLs.add(input.get(ind));
        subsequencesPrint(input, ind+1, oLs);
        oLs.remove(input.get(ind));
        subsequencesPrint(input, ind+1, oLs);
        
    }

    public static  int  printSubsequencesSumK(List<Integer> input,int sum,List<Integer> output,int ind,int psum){
        if(psum==sum){
            // System.out.println(output.toString());
            return 1;
        }

        if(ind>=input.size() ){
            return 0;
        }

        //output.add(input.get(ind));
       return  printSubsequencesSumK(input, sum, output, ind+1,psum+input.get(ind))  +  printSubsequencesSumK(input, sum, output, ind+1,psum);
        //output.remove(input.get(ind));
      
    }
//print only single sequence
    public static boolean printNSubsequences(List<Integer> input,int sum,int psum,int ind,int n,List<Integer> output){
        if(ind==n){
            if(sum==psum){
                System.out.println(output.toString());
                return true;
            }
            return false;
        }
        output.add(input.get(ind));
        psum+=input.get(ind);
        if(printNSubsequences(input, sum, psum, ind+1, n, output)) return true;

        psum-=input.get(ind);
        output.remove(input.get(ind));
        if(printNSubsequences(input, sum, psum, ind+1, n, output)) return true;

        return false;
    }


    public static void main(String[] args) {
        List<Integer> input=new ArrayList<Integer>(Arrays.asList(1,1,2,3+ ));
      System.out.println(  countSequencesSumK(input,0,input.size(),5,0));



        
    }
}
