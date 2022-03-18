package Review;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static Random rando = new Random();



    public static int randomNum() {
        int randNum = rando.nextInt(5);
        return randNum;
   }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = randomNum();

        do {


            System.out.println("Guess number from 1 to 5: ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();

            if(userGuess == answer) {
                System.out.println("You WIN! NOTHING!");
                answer = randomNum();
            } else if (userGuess > answer) {
                System.out.println("You guessed too high");
            } else {
                System.out.println("You guessed too low");
            }


            System.out.println("Wana continue?");
            String userResponse = scanner.nextLine();
            if( !userResponse.equals("y")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }


        } while (true);
    }
}


//    we want the game to keep looping letting the user try to guess the answer until the user wants to quit or the user gets it right
//        each time the loop is at the end of iteration, ask the user if he/she wants to continue
//        if the user types anything other than "y" then quit