class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int Complement = target - nums[i];

            if(map.containsKey(Complement))
            {
                return new int[] {map.get(Complement),i};
            }
            map.put(nums[i],i);
        }
         throw new IllegalArgumentException("No two sum solution");
    }
}
