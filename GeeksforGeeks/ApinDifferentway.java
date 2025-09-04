package Loops;

import java.util.Scanner;

public class ApinDifferentway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2, d = 3;
        for (int i = 1; i<= n ;i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
