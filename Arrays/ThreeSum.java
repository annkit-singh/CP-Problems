public class Solution {
    public List<List<Integer>> threeSum(int [] nums) {
        Set <List<Integer>> result=new HashSet<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            int subAr[]=Arrays.copyOfRange(nums, i+1, nums.length);
            int j=0;int k=subAr.length-1; int mid=subAr.length/2;
            while(j<mid &&   k>mid){
                int finalSum=first+subAr[j]+subAr[k]+subAr[mid];
                if(finalSum==0){
                   
                    result.add(Arrays.asList(first,subAr[j],subAr[k],subAr[mid]) );
                    break;
                    }
                else if(finalSum>0)
                    k--;
                else
                    j++;                          
        }
    }
        return new ArrayList<>(result);

    }
public static void main(String[] args){
  Solution s=new Solution();
     System.out.println(   s.threeSum(new int  []{ 1, 0, -1, 0, -2, 2}) );
      
    
}}