package OOPs;

import java.util.SplittableRandom;

public class Dog {
    private String name;
    private int numberOfChild;

    // constructor
    public Dog(String name, int numberOfChild) {
        this.name = name;
        this.numberOfChild = numberOfChild;

    }
    // setter

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfChild(int numberOfChild) {
        this.numberOfChild = numberOfChild;
    }
    public void displayDetails() {
        System.out.println("The name of dog is " + name + " and no of child " + numberOfChild);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Moti", 5);
        Dog d2 = new Dog("Ronit", 3);
        d1.displayDetails();
        d2.displayDetails();
    }
}
