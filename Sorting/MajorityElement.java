/*DAY:20
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

public class MajorityElement{

    //method1:bruteforce(O(n^2))
    public static int majorityElmntBrute(int [] nums){
        int n = nums.length;
        int j;
        for( int i=0; i<n; i++){
            int count = 0;

            for( j=0; j<n; j++){
                if(nums[i] == nums[j]) count++;
                
            }
            if(count >n/2) return nums[i];
        }

        return -1; //unreachable due to assumption
    }

    //method02: moore's voting algorithm time complexity(0(n))
    public static int majorityElmntMooreAlgo(int [] nums){
        int count = 0, candidate = 0;

        for(int num: nums){
            if(count == 0) candidate = num;
            count += (num == candidate)? 1: -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int [] nums = {3, 2, 3};
        // System.out.println(majorityElmntBrute(nums));
        System.out.println(majorityElmntMooreAlgo(nums));
    }
}