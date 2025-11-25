
package Patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){  //for rows

            int stars = n -(i -1);
            for(int j = 1; j <=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}