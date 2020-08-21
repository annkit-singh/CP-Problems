import java.util.ArrayList;

class SumAr{
    public boolean isPossible(int array[],int i,int sum,ArrayList <Integer> arl){
        if(i>=array.length || sum<0 ) return false;
        if(sum==0)  return true;

        arl.add(array[i]);

        boolean isPoss=isPossible(array, i+1, sum-array[i],arl);
        if(isPoss)
        return true;

        arl.remove(arl.size()-1);
        return isPossible(array, i+1, sum,arl);
    }

    public static void main(String[] args){
        SumAr ar=new SumAr();
        int array[]={2,1,2,3,4,8};
        int sum=0;
        for(int i:array){
            sum+=i;
        }
        ArrayList<Integer> arl=new ArrayList<Integer>();
       System.out.println( ar.isPossible(array, 0, sum/2,arl));

       System.out.println(arl);
    }
}