import java.util.Scanner;
public class ZeroAtLast {
     public static void pushZerosToEnd(int[] arr) {
     int pos = 0;
     for(int i=0; i<arr.length; i++){
         if(arr[i] != 0){
             arr[pos++] = arr[i];
         }
     }
       while(pos < arr.length) {
           arr[pos++] = 0;
       }
    }

    public static int [] inpArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input for n:");
        int n = sc.nextInt();
        int arr [] = new int [n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");

        for(int num: arr){
            System.out.print(num + " ");
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr [] = inpArr();
        pushZerosToEnd(arr);

        System.out.println(" \nArray after zeroes moved to last:");
         for(int num: arr){
            System.out.print(num + " ");
         }
    }
}
