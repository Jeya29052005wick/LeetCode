class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s1 = new TreeSet<>();
        for(int i =0;i<nums.length;i++)
        {
            s1.add(nums[i]);
        }
         int  i =0;
        for( int n : s1)
        {
            nums[i]=n;
            i=i+1;
        }
    
        return  s1.size(); 
    }
}