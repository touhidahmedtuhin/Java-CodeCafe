package Loops;

import java.util.Scanner;

public class CompositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
       boolean flag = true;
        for (int i=2;i<=Math.sqrt(n);i++){  //i<Math.sqrt(n) ; n-1
            if (n%2==0){
               flag = false;
                break;
            }
        }
        if (n == 1) System.out.println("Neither composite nor prime");
        else if (flag == false) System.out.println("composite number");
        else  System.out.println("prime number");
    }
}
