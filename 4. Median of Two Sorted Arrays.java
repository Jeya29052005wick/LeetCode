class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double a1 = 0;

        int [] arr = new int[m+n];
        for(int i = 0; i < nums1.length ;i++){
            arr[i] = nums1[i];
        }
         int k = 0;
        for(int j = nums1.length; j < m+n; j++){
            arr[j] = nums2[k];
            k++;
        }
        Arrays.sort(arr);
        if(arr.length%2 != 0){
           
           double a2 = arr[arr.length/2];
           return a2;
        }else{
            int a3 = arr[arr.length/2];
            int a4 = arr[(arr.length/2)-1];
            a1 = (double)(a3+a4)/2;
        }

        return a1;
    }
}