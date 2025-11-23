import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter array elements: ");
        int[] arr= new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is: "+ Arrays.toString(arr));
        System.out.print("Enter number of positions to rotate array: ");
        int k = sc.nextInt();
        int[] rotatearr = new int[n];
        for(int i = 0; i<n; i++){
            int new_index= (i + k) % n;  //(i + k) → moves element k positions right

            rotatearr[new_index] = arr[i]; //safely moves each element to its rotated position without losing any original value.

        }
        System.out.println("Rotated array with "+k+" positions"+ Arrays.toString(rotatearr));
    }
}
