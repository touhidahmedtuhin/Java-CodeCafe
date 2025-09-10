package Loops;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        // Handle negative input manually
        if (n < 0) {
            n = -n;
        }
        int lastDigit = n % 10;
        System.out.println("Last digit: " + lastDigit);
    }
}