package Methods;


// multiple methods can have the same name with different parameters
public class MethodOverloading {
    static int plusMethod(int x,int y){
        return x+y;
    }
    static double plusMethod(double x, double y ){
        return x+y;
    }

    public static void main(String[] args) {
        int z = plusMethod(5,6);
        double w = plusMethod(3.2,6.5);
        System.out.println("int: " + z);
        System.out.println("double: " + w);
    }
}
