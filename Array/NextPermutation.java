import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find rightmost index 'i' such that arr[i] < arr[i + 1]
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find rightmost index 'j' such that arr[j] > arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) j--;

            // Step 3: Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix starting at i+1
        reverse(arr, i + 1, n - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 1}; // Should become {1, 1, 5}
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
