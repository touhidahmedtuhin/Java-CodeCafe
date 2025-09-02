package GeeksforGeeks;

public class CharDataType {
    public static void main(String[] args) {

        // a = 97, A = 65 , 0 = 48 for
        char a = 'k';
        System.out.println(a);
        char b = 'p';
        System.out.println(b);

        //typecasting of Dta type
        char ch = 'a';
        int x  =ch ; // implicit type casting
        System.out.println(x);

        char ex = 'A';
        int y  = (int)ex; //Explicit type casting
        System.out.println(y);

        char yr = 'a';
        System.out.println(yr+0);//97

        //integer to character
        int tr = 65;
        System.out.println((char)tr);

    }
}
