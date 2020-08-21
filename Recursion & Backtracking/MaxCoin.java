class Test{
 
 public int coinWin(int array[],int l,int r){
            if(l+1==r)
           return  Math.max(array[l],array[r]);


           return Math.max(array[l]+Math.min(coinWin(array, l+1, r-1),coinWin(array,l+2,r)),
                             array[r]+Math.min(coinWin(array, l+1, r-1),coinWin(array, l, r-2)) );
           
        }

public static void main(String[] args){
Test t=new Test();
 int array[]={1,5,7,3,2,4};
      System.out.println(  t.coinWin(array, 0, array.length-1));}}