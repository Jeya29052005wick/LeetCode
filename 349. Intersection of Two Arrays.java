import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            // Skip duplicates directly while looping
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }

            if (nums1[i] == nums2[j]) {
                temp[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(temp, k);
    }
}
