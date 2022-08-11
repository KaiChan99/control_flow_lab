import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

//      Put code in here
//      set the secret number
        int secretNumber = 10;


//        prompt user to guess a number

        System.out.println("Take a guess at the secret number and enter an integer");

//        collect user input

        Scanner reader = new Scanner(System.in); // create scanner object
        String guessNumberString = reader.nextLine();



//      convert the stored value of guessNumber into an int from String

        int guessNumberInt = Integer.parseInt(guessNumberString);


//        check to see if the input number is equal to secret number
//        if number guessed is equal to secret number, tell user the guess is correct
//        if the number guessed is not equal to secret number, tell user whether it is bigger or smaller

        if (guessNumberInt == secretNumber) {
            System.out.println("You have guessed what the secret number is! it is " + secretNumber);
        } else if ( guessNumberInt > secretNumber ){
            System.out.println("Incorrect, the secret number is less than " + guessNumberInt);
        } else if ( guessNumberInt < secretNumber ) {
            System.out.println("Incorrect, the secret number is greater than " + guessNumberInt);

        }





//      Quick test code
//      System.out.println(guessNumber);
//        System.out.println(secretNumber);
    }

}
