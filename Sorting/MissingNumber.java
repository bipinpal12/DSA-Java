/*               ------DAY25----------------
 * Given an array nums containing n distinct numbers in the range [0, n],
 *  return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 2 is the missing number in the range since it does not appear in nums.
 */


public class MissingNumber {
    //METHOID01:brute force O(n2)
    public static int missingNumberBrute(int[] nums) {
    int n = nums.length;
    for (int i = 0; i <= n; i++) {
        boolean found = false;
        for (int j = 0; j < n; j++) {
            if (nums[j] == i) {
                found = true;
                break;
            }
        }
        if (!found) return i;
    }
    return -1; // not possible, just a fallback
}

}
