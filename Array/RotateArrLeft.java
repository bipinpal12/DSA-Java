public class RotateArrLeft {
    // Helper to reverse a part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // Main function to rotate left by d steps
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // In case d > n

        reverse(arr, 0, d - 1);       // Reverse first d elements
        reverse(arr, d, n - 1);       // Reverse the rest
        reverse(arr, 0, n - 1);       // Reverse whole array
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int d = 5;
        rotateLeft(arr, d);
        for (int num : arr) System.out.print(num + " ");
    }
}


