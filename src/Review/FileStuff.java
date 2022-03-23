package Review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileStuff {

    private static Scanner scanner = new Scanner(System.in);


//methods

    //prints entire grocery list
    public static void printGroceryList(Path filePath) throws IOException {
        List<String> groceries = Files.readAllLines(filePath);

        for (int i = 0; i < groceries.size(); i++) {
            System.out.println(groceries.get(i));
        }
    }

    //adds an item to the grocery list
    public static void addToList(String item) throws IOException {
        Files.write(
                Paths.get("Data", "practice.txt"),
                Arrays.asList(item), // list with one item
                StandardOpenOption.APPEND
        );
    }

    public static void deleteListItem (String item) throws IOException {
        List<String> groceries = Files.readAllLines(Paths.get("Data", "practice.txt"));




    }








//main
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("Data", "practice.txt");
        System.out.println(filePath);
        //printGroceryList(filePath);
        //addToList("Corn");
        System.out.println("1. Print all groceries");
        System.out.println("2. Add to list");
        System.out.println("3. Delete list item");
        int userInput = scanner.nextInt();

        switch (userInput ) { // takes in user input
            case 1:
                printGroceryList(filePath);
                break; // stops
            case 2:
                System.out.println("What item would you like to add?" );
                String itemToAdd = scanner.next();
                addToList(itemToAdd);
                break;
            case 3:
                System.out.println("Which item would you like to delete? ");
                String itemToDelete = scanner.next();
                deleteListItem(itemToDelete);
                break;
        }








    }
}
