
import java.util.Scanner;

public class ReversingArray {
    public static void reverseArray(int [] arr){

        int first = 0;
        int last = arr.length-1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static int [] inpArr(){
        Scanner sc = new Scanner(System.in);

        System.out.println("give input for the number of element in array:");
        int n = sc.nextInt();
        int arr [] = new int [n];

        for( int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
          System.out.println("Array elements:");

        for(int num: arr){
            System.out.print(num + " ");
        }

        return arr;

    }
    public static void main(String [] args){
        int arr [] = inpArr();
        reverseArray(arr);

            System.out.println(" \nReversed array:");
        for( int num: arr){
            System.out.print(num + " ");
        }
    }
}
