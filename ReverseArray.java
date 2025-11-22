import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");

        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is: "+ Arrays.toString(arr));
        int start = 0;
        int end = n-1;
        while(start < end){
            int temp = arr[start]; // save arr[start] temporarily
            arr[start] = arr[end]; // move arr[end] into arr[start]
            arr[end]=temp;         // put original arr[start] into arr[end]
            start++;
            end--;
        }
        System.out.println("Reversed array: "+Arrays.toString(arr));
        sc.close();
    }
}
