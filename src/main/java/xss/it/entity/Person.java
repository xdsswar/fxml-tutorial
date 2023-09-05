package xss.it.entity;

/**
 * @author XDSSWAR
 * Created on 09/05/2023
 */
public class Person {
    // Fields to store person information.
    private String name;   // Stores the name of the person.
    private int age;    // Stores the age of the person
    private double weight; // Stores the weight of the person.

    // Default constructor.
    public Person() {
        // Empty constructor allows creating a Person object with default values.
    }

    /**
     * Constructor to initialize a Person object with provided values.
     *
     * @param name   The name of the person.
     * @param age    The age of the person.
     * @param weight The weight of the person.
     */
    public Person(String name, int age, double weight) {
        // Constructor to create a Person object with specific values for name, age, and weight.
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Getter method for retrieving the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for retrieving the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter method for retrieving the weight of the person.
     *
     * @return The weight of the person.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Setter method to update the name of the person.
     *
     * @param name The new name to set for the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method to update the age of the person.
     *
     * @param age The new age to set for the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter method to update the weight of the person.
     *
     * @param weight The new weight to set for the person.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

