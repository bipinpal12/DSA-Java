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
    public static void main(String[] args) {
        int [] nums = {3, 2, 3};
        System.out.println(majorityElmntBrute(nums));
    }
}