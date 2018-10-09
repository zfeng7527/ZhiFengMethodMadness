package ZhiFeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if(ZhiFengLib.isPlaindrome("racecar")){          // tells if your word is a palindrome or not
            System.out.println("your word is a palindrome");
        }
        else System.out.println("Your word is not a palindrome");
        System.out.println("The date is " + ZhiFengLib.dateNew( "12/31/2018")); //date must be put in  mm/dd/yyyy format
        System.out.println("Sum of numbers: " + ZhiFengLib.numsum( 10));  // adds up all the numver before and the number input ( Pisitive integers above zero)
        if(ZhiFengLib.isFibonnaci(25)){                                    // Tells you if your number is fibonnaci or not.
            System.out.println("The number is Fibonnaci");
        }
        else System.out.println("The number is not Fibonnaci");
    }
}
