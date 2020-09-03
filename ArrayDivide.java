class ArrayDivide{


	public boolean arrayDivide(int array[],int i,int sum,ArrayList<Integer> arl){
		if(sum<0 || i>=array.length) return false;
		if(sum==0) return true;
		ar.add(array[i]);

		boolean isPossible=arrayDivide(array,i+1,sum-array[i],arl);
		if(isPossible)
			return true;

		ar.remove(array[i]);
		return arrayDivide(array,i+1,sum);
	}

	public static void main(String [] args){
		ArrayDivide ar=new ArrayDivide();
		
		int array[]={2,1,2,3,4,8};
        int sum=0;
        for(int i:array){
            sum+=i;
        }
       System.out.println( ar.arrayDivide(array, 0, sum/2));
	}

}