import java.util.Arrays;

public class ArraysExercises {


    private static Person[] addPerson(Person[] currentP, Person newP) {
        Person[] newPplArray =
        Arrays.copyOf(currentP, currentP.length + 1);
        newPplArray[newPplArray.length - 1] = newP;
        return newPplArray;
    }








    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));



        Person person1 = new Person("Rachel");
        Person person2 = new Person("Stephanie");
        Person person3 = new Person("Lydia");
        Person person4 = new Person("Morticia");

        Person[] peopleArray = {person1, person2, person3};
        Person[] newPeople = addPerson(peopleArray, person4);



        for (int i = 0; i < peopleArray.length ; i +=1) {
            System.out.println(peopleArray[i].getName());
        }


        for (int i = 0; i < newPeople.length ; i +=1) {
            System.out.println(newPeople[i].getName());
        }


    }
}
