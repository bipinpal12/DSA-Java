/*-----------------------DAY27----------------------------
 * Given an integer array nums, return the third distinct maximum number in this array. 
 * If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
 */
import java.util.Arrays;

public class ThirdMax {

    //method01: 0(nlogn)
    public int thirdMax(int[] nums) {
    Arrays.sort(nums); // ascending order
    int count = 1; // number of distinct elements
    
    for (int i = nums.length - 2; i >= 0; i--) {
        if (nums[i] != nums[i + 1]) {
            count++;
        }
        if (count == 3) {
            return nums[i];
        }
    }
    
    // if less than 3 distinct numbers, return the max
    return nums[nums.length - 1];
}

    
}
