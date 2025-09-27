package Methods;

public class ReturnType {
    public static int karim(int a ){
        System.out.println("Return a statement");
        if (a>5) return 5;
        else return 10;
    }
    public static void main(String[] args) {
        int x = karim(5);
        System.out.println(3+x);
    }
}
