package Loops;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0;
        if (n<0) n = -n;
        while (n!=0){
            sum+=n%10;
           n = n/10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
