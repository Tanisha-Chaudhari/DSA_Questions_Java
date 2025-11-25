package Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){  //for rows
            for(int j = 1; j <= i; j++){  //for printing stars
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

