//import java.util.Scanner;
//
//public class Bob {
//    public static void main(String[] args) {
//        boolean continueWithBob = true;
//
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("what would you like to say to bob?");
//            String userResponse = sc.nextLine().trim();
//            System.out.println(userResponse);
//
//            if(userResponse.endsWith("?")) {
//                System.out.println("sure");
//            } else if (userResponse.endsWith("!")) {
//                System.out.println("Chill bruh!");
//            } else if (userResponse.equals("")) {
//                System.out.println("it is what it is yo");
//            } else {
//                System.out.println(" okay");
//            }
//
//            System.out.println(" Do you want to continue with Bob? (y/n)");
//            String continueResponse = sc.next();
//            if (!(continueResponse.equalsIgnoreCase("y"))) {
//                continueWithBob = false;
//            }
//
//        } while (continueWithBob);
//
//    }
//}
