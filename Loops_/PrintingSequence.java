package Loops;

import java.util.Scanner;

public class PrintingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print((i/2 + 1) + " "); // Odd positions: 1,2,3...
            } else {
                System.out.print((n - i/2 + 1) + " "); // Even positions: n, n-1, n-2...
            }
        }
    }
}
