package OOPs;

public class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // gitter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Your name is " + name + " and your age " + age);
    }
    public static void main(String[] args) {
        Person x = new Person("Jahir", 21);
        x.display();

        }
    }
