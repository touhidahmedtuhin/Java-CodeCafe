package Loops;

import java.util.Scanner;

//count digits of a number
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int count = 0;
        if(n == 0){
            count = 1;
        }else {
            while (n!=0){
                n/=10;
                count++;
            }
        }
        System.out.println(count);
    }
}
