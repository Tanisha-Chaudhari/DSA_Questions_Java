package Patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= i-1; sp++) {
                System.out.print(" ");
            }

            for (int st = 1; st <= 2 * (n-i)+ 1; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
