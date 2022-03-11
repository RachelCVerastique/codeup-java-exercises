package grades;

import java.util.ArrayList;

public class Student {
  //properties
    private String studentName;
    private ArrayList<Integer> studentGrades;

    //constructor
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.studentGrades.add(grade);
    }
     //returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < studentGrades.size(); i += 1) {
           sum += studentGrades.get(i);
        }
        return sum / studentGrades.size();
    };

//    public static void main(String[] args) {
//
//        Student student1 = new Student("Suzy");
//        student1.addGrade(100);
//        System.out.println(student1.studentGrades);
//        student1.addGrade(85);
//        student1.addGrade(96);
//        student1.addGrade(85);
//        student1.addGrade(75);
//        student1.addGrade(55);
//        System.out.println(student1.studentGrades);
//        System.out.println(student1.getGradeAverage());
//
//
//    }
}
