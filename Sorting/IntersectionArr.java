/*             ---------------DAY-23----------
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 * 
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

 */

import java.util.ArrayList;
import java.util.List;

public class IntersectionArr {
    //method01: brute force O(n2)
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(!result.contains(nums1[i])){
                        result.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int [] ans = new int [result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }

    //method02: Hashing Array O(n + m) (n = size of nums1, m = size of nums2)
    // O(1001) → constant space if values are within range 0–1000
      public static int[] intersectionHashing(int[] nums1, int[] nums2) {

        int[] freq = new int[1001];  // assuming values are in range [0–1000]
        for (int num : nums1) {
            freq[num] = 1;  // mark as present in nums1
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (freq[num] == 1) {
                result.add(num);     // common element found
                freq[num] = -1;      // mark as already added
            }
        }

        // convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
