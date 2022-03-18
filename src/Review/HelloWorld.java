package Review;

import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {

    //static final int SIDES_OF_A_DICE = 6;


    public static String canGetDrink(int age) {
        if(age < 21) {
            return "Too young go away";
        } else {
            return "have a drink";
        }
    }










    public static void main(String[] args) {
//        String myString = "This is my string";
//        int myInt = 5;
//        double myDouble = 3.14;
//        myDouble = myDouble + 5;
//        myInt = (int) myDouble;
//        System.out.println("This is my int: " + myInt);
//        int million = 1000000;
//        short smallNum = (short) million;
//        System.out.println(smallNum);
//
//        float myFloat = 100_000.1f;
//
//        //SIDES_OF_A_DICE = 10;
//
//        million--;
//        System.out.println(million);
//
//
//        System.out.println("Hello, World!");
//
//
//        System.out.printf("Hello, World!\n");
//
//        System.out.printf("string: %s : int: %9d double: %.1f \n", myString, million, myDouble);
//
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//
//        System.out.println(stuff);
//        myInt = Integer.parseInt(stuff);
//        System.out.println(myInt);
//
//        input = scanner.next();
//        System.out.println(input);
//        input = scanner.next();
//        System.out.println(input);
//        input = scanner.next();
//        System.out.println(input);
//        System.out.println("Enter an integer: ");
//        myInt = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter a string: ");
//        myString = scanner.nextLine();


        //for (int i = 0; i < 7; i++) {



       // while (true) {
//            System.out.println("Enter an integer: ");
//            int loopInt = scanner.nextInt();
//            System.out.println(loopInt);
//
//            if (loopInt >= 1 && loopInt <= 7) {
//                break;
//            }
//        }

//            boolean cont = true;
//
//        do {
//            System.out.println("Enter a number 1 - 7: "); //prompts user to enter a number
//
//            int userInput = scanner.nextInt(); // scanner is being assigned to user input
//
//            switch (userInput ) { // takes in user input
//                case 1:
//                    System.out.println("Monday"); // if user inputs 1 it will print out monday
//                    break; // stops
//                case 2:
//                    System.out.println("Tuesday");// if user inputs 2 it will print out tues
//                    break;
//                case 3:
//                    System.out.println("Wednesday");// if user inputs 3 it will print out wed
//                    break;
//                case 4:
//                    System.out.println("Thursday");// if user inputs 4 it will print out thurs
//                    break;
//                case 5:
//                    System.out.println("Friday");// if user inputs 5 it will print out fri
//                    break;
//                case 6:
//                    System.out.println("Saturday");// if user inputs 6 it will print out sat
//                    break;
//                case 7:
//                    System.out.println("Sunday");// if user inputs 7 it will print out sun
//                    break;
//            }
//
//            System.out.println("Would you like to continue?"); // prompts user if they would like to cont. or not
//            String userResponse = scanner.next(); // waiting to grab user input
//
//            //if response is no ends loop
//            if( userResponse.equals("n")) {
//                System.out.println("Goodbye, and have a wonderful day!");
//                // break;
//                cont = false;
//            }
//
//
//        } while (cont);

//        do {
//            System.out.println("Enter a temp in fahrenheit to convert to celsius: "); // prompting to ask for a temp
//            int userInput = scanner.nextInt();
//            System.out.println(userInput + "°F Coverts to " + ((userInput - 32) * 5/9) + "°C" );
//            System.out.println("Would you like to continue? y/n");
//            String userResponse = scanner.next();
//
//            if( userResponse.equals("n")) {
//                System.out.println("Goodbye, and have a wonderful day!");
//                break;
//            }
//
//
//
//        } while (true);

//        System.out.println("Enter a string: ");
//        String userResponse = scanner.nextLine();
//        System.out.println(userResponse.length());
//
//        System.out.println(userResponse.contains("pine"));
//        System.out.println(userResponse.indexOf("px"));
//        System.out.println(userResponse.lastIndexOf("app"));
//        System.out.println(userResponse.charAt(10));
//        System.out.println(userResponse.toUpperCase().charAt(10));
//        System.out.println("  fsjjsjdnfjsndf    ".toUpperCase().trim());
//        System.out.println("  fsjjsjdnfjsndf    ".toUpperCase());
//
//
//        for (int i = 0; i < userResponse.length(); i++) {
//            System.out.print(userResponse.charAt(i));
//        }
//
//        System.out.println("Enter string 1: ");
//        String stringOne = scanner.nextLine();
//        System.out.println("Enter string 2: ");
//        String stringTwo = scanner.nextLine();
//
//        System.out.println(stringOne == stringTwo); // == looks at memory address
//        System.out.println(stringOne.equals(stringTwo)); // .equals looks at content

        System.out.println("How old are you? ");
        int userResponse = scanner.nextInt();
        System.out.println(canGetDrink(userResponse));



    }
}
