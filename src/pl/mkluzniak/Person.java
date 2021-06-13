package pl.mkluzniak;

public class Person {

    String name;
    int age;

    Person(String name, int age) { // set up parameters that we need in this class
        this.name = name; // assign values of attributes
        this.age = age;

    }

    public String toString() {
        return this.name + "\n" + this.age + "\n"; //function to return name and age and adding new line between in
    }

}
