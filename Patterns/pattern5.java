package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}