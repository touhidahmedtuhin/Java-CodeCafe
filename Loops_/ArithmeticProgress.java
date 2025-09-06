package Loops;

import java.util.Scanner;

public class ArithmeticProgress {
    public static void main(String[] args) {

        //Display this Ap - 2,5,8,11... up to 'n' terms
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i<=3*n-1;i+=3){
            System.out.println(i+" ");
        }
    }
}
