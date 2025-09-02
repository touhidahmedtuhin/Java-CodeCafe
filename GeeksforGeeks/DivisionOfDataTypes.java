package GeeksforGeeks;

public class DivisionOfDataTypes {
    public static void main(String[] args) {
        // a%b if a (a<b)
        // a%(-b)  a%b
        //(-a)%b  -(a%b)

        double x = 5/2;
        System.out.println(x); //2

        double y = 5.0/2;
        System.out.println(y);//2.5

        double z = 5/2.0;
        System.out.println(z);//2.5


        int p = 69 , r = 5, t = 8;
        double si = p*r*t / 100.0;
        System.out.println(si); //27.6

    }
}
