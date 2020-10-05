class Demo {

    public List<List<Integer>> fourSums(int array[],int target){
         Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(array);
        
        for(int i=0;i<array.length-3;i++){
            for(int j=1;j<array.length-2;j++){
               
                int low=j+1;
                int high=array.length-1;
                while(low<high){
                        int sum=array[i]+array[j]+array[low]+array[high];
                    if(sum==target){
                        result.add(Arrays.asList(array[i],array[j],array[low],array[high]) );
                        low++;
                        high--;

                    }
                    else if(sum>target){
                        high--;
                    }
                    else{
                        low++;
                    }
                }

            }
        }
        return new ArrayList<>(result);
    }
     public static void main(String[]  args){
         Demo d=new Demo();
 System.out.println(   s.fourSums(new int  []{ 1, 0, -1, 0, -2, 2}) );
}     
}






