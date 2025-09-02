package GeeksforGeeks;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int x = sc.nextInt();
        int result = x * x;
        System.out.println("Square :" + result);
    }
}
