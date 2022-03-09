package Practice;

public class Cat {
    private boolean isHungry;
    private int age;
    private String name;
 //constructor
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        this.isHungry = true;
    }

//methods
    private void makeSound() {
        System.out.println("Meow");
    }



// getters and setters
    public boolean isHungry() {
        return isHungry;
    }


    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat(40, "pickles");
        System.out.println(cat1.getAge());
        cat1.makeSound();
        cat1.setName("Sean");
        System.out.println(cat1.getName());
    }

}




