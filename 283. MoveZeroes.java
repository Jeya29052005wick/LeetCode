class Solution {
    public void moveZeroes(int[] nums) {
       int insertindexPos = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[insertindexPos] = nums[i];
                insertindexPos++;
            }
        }
        while (insertindexPos < nums.length){
            nums[insertindexPos] = 0;
            insertindexPos++;
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter No Of Elements in an array:");
        int n = scan.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }

        sol.moveZeroes(arr);

        System.out.println("After Moved the Zeroes:");
        System.out.println(Arrays.toString(arr));
    }
}