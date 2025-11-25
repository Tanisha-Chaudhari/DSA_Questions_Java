import java.util.Arrays;
import java.util.Scanner;

public class ZeroToBeginning {
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

        int j = n -1;  // pointer where next non-zero will be written
        //move all non zero elements to end
        for(int i =n-1; i>=0;i--){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j--;
            }

        }


        // Step 2: fill the remaining left side with zeros
         while (j >= 0){
             arr[j]=0;
             j--;
         }
        System.out.println("Zeros moved to beginning: " + Arrays.toString(arr));

    }
}
