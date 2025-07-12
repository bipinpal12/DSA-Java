

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */


public class ContainsDuplicates{
    //method01 brute force
    public static boolean duplicates(int [] nums){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if(nums[i]== nums[j]) return true;     
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(duplicates(nums));
    }
}