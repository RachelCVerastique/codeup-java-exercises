package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        if( scanner.nextLine().equals("yes") || scanner.nextLine().equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Give me a number between " + min + "and " + max);
        int userNumber = Integer.valueOf(scanner.nextLine());
        if( userNumber >= min && userNumber <= max) {
            return userNumber;
        }
        System.out.println(" Your number is not within range");
        return getInt(min, max);
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Give me a number between " + min + "and " + max);
        double userNumber = Integer.valueOf(scanner.nextLine());
        if( userNumber >= min && userNumber <= max) {
            return userNumber;
        }
        System.out.println(" Your number is not within range");
        return getDouble(min, max);
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }


    public static void main(String[] args) {
        Input input = new Input();
        input.getInt(1, 10);
        //System.out.println(input.getInt(1,11));

    }
}

