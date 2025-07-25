import java.util.Arrays;
public class MergeSortedArray {
    //method1: brute force   time complexity O(m+n log(m+n))
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);  // total O((m+n) log(m+n))
    }

    //method2:

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));  // [1, 2, 3, 4, 5, 6]
    }
}
