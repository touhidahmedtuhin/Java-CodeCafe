package Loops;

import java.util.Scanner;

public class GeometricProgression {
    //Display this Gp 1,2,4,8,... up to 'n' terms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, r = 2;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
