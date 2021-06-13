package pl.mkluzniak;

public class Hero extends Person { //class extended to be used by another class
    String power;

    Hero(String name, int age, String power) { // set up parameters that we need in this class
        super(name, age); //refers name and age to parent class -> Person
        this.power = power; // assign values of power attribute

    }

    public String toString() {
        return super.toString() + this.power; //using super keyword to return in person class within toString method and a power
    }
}
