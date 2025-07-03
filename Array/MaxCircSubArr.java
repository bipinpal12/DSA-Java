public class MaxCircSubArr {
    public static int kadane(int [] arr){
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];
        
        for(int i=1; i<arr.length; i++){
            maxCurrent = Math.max(arr[i], maxCurrent+arr[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }
        return maxGlobal;
    }
    public static int circularSubarraySum(int arr[]) {
        int totalSum = 0;
        boolean allNegative = true;
        
        for(int num:arr){
            totalSum += num;
            if(num>0) allNegative = false;
        }
        int maxKadane = kadane(arr);
        
        if(allNegative) return maxKadane;
        
        for(int  i=0; i<arr.length;i++){
            arr[i] = -arr[i];
        }
        
        int minSubarraySum = kadane(arr);
        int maxCircular = totalSum+minSubarraySum;
        
        return Math.max(maxKadane, maxCircular); 
 }
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
  }

}
 