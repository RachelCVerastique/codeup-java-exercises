package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Suzy");
        student1.addGrade(96);
        student1.addGrade(85);
        student1.addGrade(75);
        student1.addGrade(55);
        Student student2 = new Student("Lauren");
        student2.addGrade(96);
        student2.addGrade(45);
        student2.addGrade(75);
        student2.addGrade(95);
        Student student3 = new Student("Sheila");
        student3.addGrade(96);
        student3.addGrade(45);
        student3.addGrade(75);
        student3.addGrade(95);
        students.put("soozyq1", student1);
        students.put("LalaLoren", student2);
        students.put("SheilaOHSheila", student3);

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");

        for (String key: students.keySet()) {
            System.out.print("|" + key + "| ");
        }
        System.out.println();


        do {
            System.out.println("What student would you like to see more information on?");
            String userInput = sc.next();
            sc.nextLine();

            if(students.containsKey(userInput)) {
                Student currentStudent = students.get(userInput);
                System.out.println(currentStudent.getName());
                System.out.println(currentStudent.getGradeAverage());
            } else {
                System.out.println("YOU SHALL NOT PASS!");
                System.out.println("Would you like to see another student?");
            }

            System.out.println("Would you like to continue?");
            userInput = sc.next();
            sc.nextLine();

            if( userInput.equals("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }

            } while (true);
    }
}
