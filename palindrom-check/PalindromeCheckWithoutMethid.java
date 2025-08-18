public class PalindromeCheckWithoutMethid {
  public static void main(String[] args) {
    int number = 121 ;
    int originalNumber = number ;
    int resersedNumber = 0 ;

    //reversing the number 
    while (number != 0) {
      int lastDigit = number % 10 ;
      resersedNumber = resersedNumber * 10 + lastDigit ;
      number = number / 10 ;
    }
    if (originalNumber == resersedNumber ) {
      System.out.println("121 is a palindrom");
    } else {
      System.out.println( "121 is not palindrome");
    }
  }
}
