public class MisingPositiveNum {

    public static int findMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Place numbers at correct position
        for (int i = 0; i < n; i++) {
            while (
                arr[i] > 0 && arr[i] <= n &&  // only valid values
                arr[arr[i] - 1] != arr[i]     // not already in right place
            ) {
                // Swap arr[i] with the number at its correct position
                int correctIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        // Step 2: Check which index is incorrect
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: All numbers from 1 to n are present
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -1, 1};
        int[] arr2 = {1, 2, 0};
        int[] arr3 = {7, 8, 9, 11, 12};

        System.out.println("Missing from arr1: " + findMissingPositive(arr1)); // 2
        System.out.println("Missing from arr2: " + findMissingPositive(arr2)); // 3
        System.out.println("Missing from arr3: " + findMissingPositive(arr3)); // 1
    }
}
