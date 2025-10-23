class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count = count + 1;
                }
            }
            if(count > nums.length/2){
                result = nums[i];
                return result;
            }
            count = 0;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Solution sol = new Solution();
        
        int n = scan.nextInt();
        System.out.println("Enter the Array: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int output = sol.majorityElement(arr);
        System.out.println(output);
    }
}