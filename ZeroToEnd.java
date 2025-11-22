import java.util.Arrays;
import java.util.Scanner;

public class ZeroToEnd {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array: ");

            int n =sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements");
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array: " + Arrays.toString(arr));

            int j = 0; // pointer for next non-zero position

            // Step 1: move all non-zero elements to front
            for(int i =0; i< n;i++){
                if(arr[i] !=0){
                    arr[j] = arr[i];
                    j++;
                }
            }

            // Step 2: fill remaining positions with zero
            while(j < n){
                arr[j] =0;
                j++;
            }

            System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));
            sc.close();

    }
}
