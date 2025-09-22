package Methods;

public class FunctionCall {
    public static void call(){
        System.out.println("Hi,This is a function call");
        againcall();
    }
    public static void againcall(){
        System.out.println("I am call by another");
        returncall();
    }
    public static int returncall(){
        System.out.println("Int statement return type is mandatory");
        return 1;
    }
    public static void main(String[] args) {
       call();
    }
}
