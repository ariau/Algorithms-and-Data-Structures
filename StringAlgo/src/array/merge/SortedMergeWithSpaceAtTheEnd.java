package array.merge;

import java.util.Arrays;

public class SortedMergeWithSpaceAtTheEnd {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5, 0, 0, 0};
        int validNumber1 = 3;
        int[] nums2 = new int[]{2, 4, 6};
        int validNumber2 = 3;
        int[] merged = merge(nums1, validNumber1, nums2, validNumber2);
        Arrays.stream(merged).forEach(n->System.out.println(" "+n));
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last valid element of nums1
        int j = n - 1; // Last valid element of nums2
        int k = m + n - 1; // Last element of nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--]=nums1[i--];
            } else {
                nums1[k--]=nums2[j--];
            }
        }

        return nums1;
    }
}
