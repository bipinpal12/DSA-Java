import java.util.*;

class SecLargest {
    public static  int getSecondLargest(int[] arr) {
        // code here
        
        if(arr == null || arr.length<2) return -1;
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int num:arr){
            if( num > largest){
                secondLargest =  largest;
                largest = num;
            }else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
         return (secondLargest == Integer.MIN_VALUE)? -1 : secondLargest;
    }
   
    public static int [] inpArr(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Give input for n:");

        int n = sc.nextInt();
        int arr [] = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }   
        System.out.println("Array Elements:");

        for(int num: arr){
            System.out.print(num + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr [] = inpArr();
        System.out.println(getSecondLargest(arr));

    }
}