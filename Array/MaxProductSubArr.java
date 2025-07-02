public class MaxProductSubArr {
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProd = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = currMax;

            currMax = Math.max(arr[i], Math.max(arr[i] * currMax, arr[i] * currMin));
            currMin = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * currMin));

            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, -2, 4};
        int[] arr2 = {-2, 0, -1};
        int[] arr3 = {-2, 1, -3, 4, -1, 2, 1, -6, -4};

        System.out.println("Max product 1: " + maxProduct(arr1)); // 6
        System.out.println("Max product 2: " + maxProduct(arr2)); // 0
        System.out.println("Max product 3: " + maxProduct(arr3)); // 288
    }
}
