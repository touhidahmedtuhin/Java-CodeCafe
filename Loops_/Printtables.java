package Loops;

import java.util.Scanner;

public class Printtables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Number : ");
        int s =input.nextInt();
        System.out.print("Enter The Ending Number : ");
        int e =input.nextInt();
        System.out.print("Enter The Tables Number : ");
        int t =input.nextInt();
        //print tables
        for (int i=s;i<=e;i++){
            System.out.print((t*i)+" ");
        }
        //Reverse print tables
        for (int i=e;i>=s;i--){
            System.out.print((t*i)+" ");
        }

    }
}
