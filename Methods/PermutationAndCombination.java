package Methods;

import java.util.Scanner;

//take n and r input and print nCr and nPr
public class PermutationAndCombination {
    public static int fact(int x){
        int f =1;
        for (int i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and r:");
        int n = sc.nextInt();
        int r = sc.nextInt();


        int ncr = fact(n) / (fact(r) * fact(n - r));
        int npr = fact(n) / fact(n - r);
        System.out.println("For n = " + n + " and r = " + r + ":");
        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);

    }
}
