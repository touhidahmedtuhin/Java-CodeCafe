package Methods;

public class ClassScope {
    int x = 5; // Class variable

    public static void main(String[] args) {
        ClassScope  myObj = new ClassScope();
        System.out.println(myObj.x); // Accessible here
    }

    /* static int x = 5; // Now it's a static variable

  public static void main(String[] args) {
    System.out.println(x); // ✅ Works now
  }
   */

}
