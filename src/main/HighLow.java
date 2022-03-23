package main;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

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
