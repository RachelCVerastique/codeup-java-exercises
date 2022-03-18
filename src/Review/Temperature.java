package Review;

import java.util.Scanner;

public class Temperature {

    private static Scanner scanner = new Scanner(System.in);


    public static int getFahrenheit() {
        System.out.println("Enter a temp in fahrenheit to convert to celsius: "); // prompting to ask for a temp
        int userInput = scanner.nextInt();
        return userInput;
    }


    public static void main(String[] args) {

        int tempF;

        do {
            tempF = getFahrenheit();
            System.out.println(tempF + "°F Coverts to " + ((tempF - 32) * 5 / 9) + "°C");
            System.out.println("Would you like to continue? y/n");
            String userResponse = scanner.next();

            if (userResponse.equals("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }


        } while (true);


    }
}