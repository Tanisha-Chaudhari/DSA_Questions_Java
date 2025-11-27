package Patterns;
import java.util.*;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();

        // Upper Pyramid
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }

            // stars
            for (int st = 1; st <= 2 * i - 1; st++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }

            // stars
            for (int st = 1; st <= 2 * i - 1; st++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
