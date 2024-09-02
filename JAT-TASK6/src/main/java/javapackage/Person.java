package javapackage;

public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method to demonstrate the use of the Person class
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("APARNA", 30);

        // Using the getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
