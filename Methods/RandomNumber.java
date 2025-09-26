package Methods;

public class RandomNumber {
    public static void main(String[] args) {
       int random =  getRandom(5 ,15);
        System.out.println(random);

    }

    public static int getRandom(int a, int b){
        return (int) (Math.random()*(b-a+1)+a);
    }
}
