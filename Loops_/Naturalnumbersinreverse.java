package Loops;

import java.util.Scanner;

public class Naturalnumbersinreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int m = sc.nextInt();
        System.out.print("Enter last Number :");
        int n = sc.nextInt();
        for (int i=n;i>=m;i--){
            System.out.print(i+" ");
        }
    }
}
