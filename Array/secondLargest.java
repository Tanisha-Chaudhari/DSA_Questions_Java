import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if(n < 2){
            System.out.println("Second largest does not exist (array too small)");
            return;
        }
        int[] arr= new int[n];

        System.out.print("Enter array elements");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                   secondMax = max;
                   max=arr[i];
            } else if (arr[i] > secondMax && arr[i]< max) {
                secondMax= arr[i];

            }
        }

        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }
        else{
            System.out.println("Second largest element: "+ secondMax);
        }
    }
}
