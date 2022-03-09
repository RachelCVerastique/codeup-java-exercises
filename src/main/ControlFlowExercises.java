//import java.util.function.ToDoubleBiFunction;
//
//import java.util.Scanner;
//
//public class ControlFlowExercises {
//
//    public static void main(String[] args) {
//        int i = 5;
//            while(i <= 15) {
//                System.out.println(i++);
//        }
//        int i = 0;
//        do {
//            System.out.println("Your number is : " + i);
//            i+=2;
//        } while( i <= 100 );
//        int i = 100;
//        do {
//            System.out.println("Your number is : " + i);
//            i-=5;
//        } while( i >= -10 );
//
//       // HALP***********************************************************
//        int i = 2;
//        do {
//            System.out.println("Your number is : " + i);
//            i = (int) Math.pow(i, 2);
//
//        } while( i <= 1000000 );
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.println("Your number is  " + i);
//        }
//
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println("Your number is  " + i);
//        }
//
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println("Your number is  " + i);
//        }
//
//      //HALP***************************************************
//        for (int i = 2; i <= 1000000;  i = (int) Math.pow(i, 2)) {
//
//            System.out.println("Your number is  " + i);
//        }
//
//        //Fizz Buzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 ){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//            Scanner sc = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to ?");
//
//        int userInt = sc.nextInt();
//
//        System.out.println("");
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("-----  | -----  | -----");
//
//        for (int i = 1; i <= userInt ; i++) {
//            System.out.println(i + "     | " + (i * i) + "     |" + "  " +(i * i * i));
//        }
//
//
//
//
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter a grade from 0 to 100");
//        int userInt = sc.nextInt();
//
//
//        do {
//            if ( userInt <= 100 && userInt >= 88) {
//                System.out.println("A: 100 - 88");
//            } else if (userInt <= 87 && userInt >= 80) {
//                System.out.println("B: 87 - 80");
//            } else if (userInt <= 79 && userInt >= 67) {
//                System.out.println("C: 79 - 67");
//            } else if (userInt <= 66 && userInt >= 60) {
//                System.out.println("D: 66 - 60");
//            } else {
//                System.out.println("F: 59 - 0");
//            }
//
//            System.out.println("enter another grade");
//            String
//        } while (true);
//
//
//    }
//}
